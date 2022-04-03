import java.util.Scanner;

public class Subject {
	Student student;
	Scanner input;
	int a;
	Subject(Scanner input){
		this.input = input;
	}
	public void add() {
		student = new Student();
		System.out.print("Your ID: ");
		student.id = input.nextInt();
		System.out.print("Add Subject Name: ");
		student.subjectName = input.next();
		System.out.print("Add Subject professor Name: ");
		student.professorName = input.next();
	}
	public void delete() {
		System.out.print("Your ID: ");
		int id = input.nextInt();
		System.out.print("Delete Subject Name: ");
		String subjectName = input.next();
		System.out.print("Delete Subject professor Name: ");
		String professorName = input.next();
		if (student == null) {
			System.out.println("the student has not been registered");
			return;
		}
		if (student.id == id && student.subjectName.equals(subjectName) && student.professorName.equals(professorName)) {
			student = null;
			System.out.println("the student is deleted");
		}
		else {
			System.out.println("the student has not been registered");
			return;
		}
	}
	public void edit() {
		System.out.print("Your ID: ");
		int id = input.nextInt();
		if (student.id == id) {
			System.out.println("Okay wait!");
			System.out.print("편집할 과목을 고르시오 : ");
			String subjectName = input.next();
			System.out.print("편집할 과목의 교수님 성함을 입력하시오: ");
			String professorName = input.next();
			if(student.subjectName.equals(subjectName) && student.professorName.equals(professorName)) {
			System.out.print("Edit Subject Name: ");
			student.subjectName = input.next();
			System.out.print("Edit Subject Professor Name: ");
			student.professorName = input.next();
			System.out.println("과목이 편집 되었습니다!");
		}
			else {
				System.out.println("과목을 찾을 수 없습니다!");
			}
		}
	}
	public void view() {
		System.out.print("Your ID: ");
		int id = input.nextInt();
		if (student.id == id) {
			student.printInfo();
		}
	}
}
