package manager;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import Student.EngineeringStudent;
import Student.Liberalarts;
import Student.Medical;
import Student.Operation;
import Student.Student;
import Student.StudentInput;
import Student.StudentKind;

public class Subject implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 7662770305749581270L;
	ArrayList<StudentInput> students = new ArrayList<StudentInput>();
	transient Scanner input;
	Subject(Scanner input){
		this.input = input;
	}
	
	public void add(int ID, String subjectName, String professorName) {
		StudentInput studentInput = new EngineeringStudent(StudentKind.Engineering);
		studentInput.getUserInput(input); 
		students.add(studentInput);
	}
	
	public void add(StudentInput studentInput) {
		students.add(studentInput);
	}
	
	
	public void add() {
		int kind = 0;
		StudentInput studentInput;
		while (kind < 1 || kind > 4) {
			try { 
				System.out.println(" 1 for engineering");
				System.out.println(" 2 for Operation ");
				System.out.println(" 3 for Medical");
				System.out.println(" 4 for Liberalarts ");
				System.out.print("Select num 1~4 for Student Kind: ");
				kind = input.nextInt();
				if(kind == 1) {
					studentInput = new EngineeringStudent(StudentKind.Engineering);
					studentInput.getUserInput(input); 
					students.add(studentInput);
					break;
				}
				else if(kind == 2) {
					studentInput = new Operation(StudentKind.Operation);
					studentInput.getUserInput(input);
					students.add(studentInput);
					break;
				}
				else if(kind == 3) {
					studentInput = new Medical(StudentKind.Medical);
					studentInput.getUserInput(input);
					students.add(studentInput);
					break;
				}
				else if(kind == 4) {
					studentInput = new Liberalarts(StudentKind.Liberalarts);
					studentInput.getUserInput(input);
					students.add(studentInput);
					break;
				}
				else {
					System.out.print("Select num 1~4 for Student Kind: ");
				}
			}
			catch (InputMismatchException e) {
				System.out.println("please put an integer between 1 and 4!");
				if(input.hasNext()) {
					input.next();
				}
				kind = -1;
			}
		}

	}
	public void delete() {
		System.out.print("Your ID: ");
		int id = input.nextInt();
		System.out.print("Delete Subject Name: ");
		String subjectName = input.next();
		System.out.print("Delete Subject professor Name: ");
		String professorName = input.next();
		int index = findIndex(id, subjectName, professorName);
		removefromSubject(index, id, subjectName, professorName);
	}
	
	public int findIndex(int id, String subjectName, String professorName) {
		int index = -1 ;
		for(int i = 0; i <students.size(); i++) {
			if (students.get(i).getId() == id && students.get(i).getSubjectName().equals(subjectName) && students.get(i).getProfessorName().equals(professorName)) {
				index = i;
				break;
			}
		}
		return index;
	}
	
	public int removefromSubject(int index, int id, String subjectName, String professorName) {
		if(index >= 0) { 
			System.out.println("the subject " + subjectName + " is deleted");
			students.remove(index);
			return 1;
		}
		else {
			System.out.println("the subject has not been registered");
			return -1;
		}
	}
	
	public void edit() {
		System.out.print("Your ID: ");
		int id = input.nextInt();
		for(int i = 0; i <students.size(); i++) {
			StudentInput student = students.get(i);
			if (students.get(i).getId() == id) {
				int num = -1;
				while(num != 2) {
					showEditMenu();
					num = input.nextInt();
					switch(num) {
					case 1:
						student.setSubjectName(input);
						break;
					case 2:
						student.setprofessorName(input);
						break;
					default:
						continue;	
					}
				}
					break;
				}
			}		
			}
	
		public void viewStudents() {
			for(int i = 0; i <students.size(); i++) {
				students.get(i).printInfo();
			}
		}
		public int size() {
			return students.size();
		}
		
		public StudentInput get(int index) {
			return (Student) students.get(index);
		}
		
		public void showEditMenu() {
			System.out.println("** Subject Info Edit Menu **");
			System.out.println(" 1. Edit Subject Name");
			System.out.println(" 2. Edit Subject Professor Name");
			System.out.println(" Select one number between 1 ~2 : ");
			 
		}
}
