import java.util.ArrayList;
import java.util.Scanner;

import Student.Liberalarts;
import Student.Medical;
import Student.Operation;
import Student.Student;
import Student.StudentKind;

public class Subject {
	ArrayList<Student> students = new ArrayList<Student>();
	Scanner input;
	int a;
	Subject(Scanner input){
		this.input = input;
	}
	public void add() {
		int kind = 0;
		Student student;
		while (kind != 1 && kind != 2 && kind != 1 && kind != 2) {
			System.out.println(" 1 for engineering");
			System.out.println(" 2 for Operation ");
			System.out.println(" 3 for Medical");
			System.out.println(" 4 for Liberalarts ");
			System.out.print("Select num 1~4 for Student Kind: ");
			kind = input.nextInt();
			if(kind == 1) {
				student = new Student(StudentKind.Engineering);
				student.getUserInput(input); 
				students.add(student);
				break;
			}
			else if(kind == 2) {
				student = new Operation(StudentKind.Operation);
				student.getUserInput(input);
				students.add(student);
				break;
			}
			else if(kind == 3) {
				student = new Medical(StudentKind.Medical);
				student.getUserInput(input);
				students.add(student);
				break;
			}
			else if(kind == 4) {
				student = new Liberalarts(StudentKind.Liberalarts);
				student.getUserInput(input);
				students.add(student);
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
			Student student = students.get(i);
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
						student.setSubjectName(subjectName);
					}
					if(num==2) {
						System.out.print("편집할 과목의 교수님 성함을 입력하시오 : ");
						String professorName = input.next();
						student.setProfessorName(professorName);
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
