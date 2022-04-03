import java.util.Scanner;

public class SubjectManagementSystem {
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		Subject subject = new Subject(input);
		int x = 0;
		while (x != 5) {
		System.out.println("*** Subject Management System Menu ***");
		System.out.println("1. Add Subjects");
		System.out.println("2. Delete Subjects");
		System.out.println("3. Edit Subjects");
		System.out.println("4. View Subjects");
		System.out.println("5. Exit");
		System.out.print("Select one number 1-5:");
		x = input.nextInt();
		if (x == 1) {
			subject.add();
		}
		else if (x == 2) {
			subject.delete();
		}
		else if (x == 3) {
			subject.edit();
		}
		else if (x == 4) {
			subject.view();
		}
		else {
			continue;
		}
		}
	}

}

