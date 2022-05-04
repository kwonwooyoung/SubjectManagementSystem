import java.util.ArrayList;
import java.util.Scanner;

import Student.EngineeringStudent;
import Student.Liberalarts;
import Student.Medical;
import Student.Operation;
import Student.Student;
import Student.StudentInput;
import Student.StudentKind;

public class Subject {
	ArrayList<StudentInput> students = new ArrayList<StudentInput>();
	Scanner input;
	int a;
	Subject(Scanner input){
		this.input = input;
	}
	public void add() {
		int kind = 0;
		StudentInput studentInput;
		while (kind != 1 && kind != 2 && kind != 1 && kind != 2) {
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

	}
	public void delete() {
		System.out.print("Your ID: ");
		int id = input.nextInt();
		System.out.print("Delete Subject Name: ");
		String subjectName = input.next();
		System.out.print("Delete Subject professor Name: ");
		String professorName = input.next();
		int index = -1 ;
		for(int i = 0; i <students.size(); i++) {
			if (students.get(i).getId() == id && students.get(i).getSubjectName().equals(subjectName) && students.get(i).getProfessorName().equals(professorName)) {
				index = i;
				break;
			}
		}
		if(index >= 0) { 
			System.out.println("the subject " + subjectName + " is deleted");
			students.remove(index);
		}
		else {
			System.out.println("the subject has not been registered");
			return;
		}
	}
	public void edit() {
		System.out.print("Your ID: ");
		int id = input.nextInt();
		for(int i = 0; i <students.size(); i++) {
			StudentInput studentInput = students.get(i);
			if (students.get(i).getId() == id) {
				int num = -1;
				while(num != 2) {
					System.out.println("** Subject Info Edit Menu **");
					System.out.println(" 1. Edit Subject Name");
					System.out.println(" 2. Edit Subject Professor Name");
					System.out.println(" Select one number between 1 ~2 : ");
					num = input.nextInt();
					if(num==1) {
						System.out.print("편집할 과목을 고르시오 : ");
						String subjectName = input.next();
						studentInput.setSubjectName(subjectName);
					}
					if(num==2) {
						System.out.print("편집할 과목의 교수님 성함을 입력하시오 : ");
						String professorName = input.next();
						studentInput.setProfessorName(professorName);
					}
					else {
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
}
