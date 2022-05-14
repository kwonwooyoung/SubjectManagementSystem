import java.util.InputMismatchException;
import java.util.Scanner;

public class SubjectManagementSystem {
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		Subject subject = new Subject(input);
		selectMenu(input, subject);
	}
	public static void selectMenu(Scanner input, Subject subject) {
		int x = 0;
		while (x != 5) {
		try {
			showMenu();
			x = input.nextInt();
			switch(x) {
			case 1:
				subject.add();
				break;
			case 2:
				subject.delete();
				break;
			case 3:
				subject.edit();
				break;
			case 4:
				subject.viewStudents();
				break;  
			default:
				continue;
						
				}
			}
			catch(InputMismatchException e) {
				System.out.println("please put an integer between 1 and 5!");
				if(input.hasNext()) {
					input.next();
				}
				x = -1;
			}
		}
	}
	public static void showMenu() {
		System.out.println("*** Subject Management System Menu ***");
		System.out.println("1. Add Subject");
		System.out.println("2. Delete Subject");
		System.out.println("3. Edit Subject");
		System.out.println("4. View Subjects");
		System.out.println("5. Exit");
		System.out.print("Select one number 1-5:");
	}
}

