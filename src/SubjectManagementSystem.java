import java.util.Scanner;

public class SubjectManagementSystem {
	public static void main (String[] args) {
		int x = 0;
		Scanner input = new Scanner(System.in);
		while (x != 6) {
		System.out.println("*** Subject Management System Menu ***");
		System.out.println("1. Add Subjects");
		System.out.println("2. Delete Subjects");
		System.out.println("3. Edit Subjects");
		System.out.println("4. View Subjects");
		System.out.println("5. Show a menu");
		System.out.println("6. Exit");
		System.out.print("Select one number 1-6:");
		x = input.nextInt();
		if (x == 1) {
			System.out.print("Your ID: ");
			int id = input.nextInt();
			System.out.print("Add Subject Name: ");
			String subjectName = input.next();
			System.out.print("Subject professor Name: ");
			String professorName = input.next();
		}
		else if (x == 2) {
			System.out.print("Your ID: ");
			int id = input.nextInt();
			System.out.print("Delete Subject Name: ");
			String subjectName = input.next();
			System.out.print("Subject professor Name: ");
			String professorName = input.next();
		}
		else if (x == 3) {
			System.out.print("Your ID: ");
			int id = input.nextInt();
			System.out.print("Edit Subject Name: ");
			String subjectName = input.next();
			System.out.print("Edit Subject Professor Name: ");
			String professorName = input.next();
		}
		else if (x == 4) {
			System.out.print("Your ID: ");
			int id = input.nextInt();
		}
		else if (x == 5) {
			System.out.println("*** Subject Management System Menu ***");
			System.out.println("1. Add Subjects");
			System.out.println("2. Delete Subjects");
			System.out.println("3. Edit Subjects");
			System.out.println("4. View Subjects");
			System.out.println("5. Show a menu");
			System.out.println("6. Exit");
			System.out.println("Select one number 1-6:");
			x = input.nextInt();
		}
		}
	}
}
