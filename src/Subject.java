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
			System.out.print("������ ������ ���ÿ� : ");
			String subjectName = input.next();
			System.out.print("������ ������ ������ ������ �Է��Ͻÿ�: ");
			String professorName = input.next();
			if(student.subjectName.equals(subjectName) && student.professorName.equals(professorName)) {
			System.out.print("Edit Subject Name: ");
			student.subjectName = input.next();
			System.out.print("Edit Subject Professor Name: ");
			student.professorName = input.next();
			System.out.println("������ ���� �Ǿ����ϴ�!");
		}
			else {
				System.out.println("������ ã�� �� �����ϴ�!");
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
