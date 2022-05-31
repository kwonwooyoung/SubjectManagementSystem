package manager;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.InputMismatchException;
import java.util.Scanner;


import gui.WindowFrame;



public class SubjectManagementSystem {
	static EventLogger logger = new EventLogger("log.txt");
	
	public static void main (String[] args) { 
		Scanner input = new Scanner(System.in);
		
		Subject subject = getObject("subject.ser");

		if(subject == null) {
			subject = new Subject(input);
		}

		
		WindowFrame frame = new WindowFrame(subject);
		selectMenu(input, subject);
		putObject(subject, "subject.ser");
	}
	public static void selectMenu(Scanner input, Subject subject) {
		int x = -1	;
		while (x != 5) {
		try {
			showMenu();
			x = input.nextInt();
			switch(x) {
			case 1:
				subject.add();
				logger.log("add a subject");
				break;
			case 2:
				subject.delete();
				logger.log("delete a subject");
				break;
			case 3:
				subject.edit();
				logger.log("edit a subject");
				break;
			case 4:
				subject.viewStudents();
				logger.log("view a subject");
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
	public static Subject getObject(String filename) {
		Subject subject = null;
		try {
			FileInputStream file = new FileInputStream(filename);
			ObjectInputStream in = new ObjectInputStream(file);
			
			subject = (Subject) in.readObject();
			
			in.close();
			file.close();
		} catch(FileNotFoundException e) {
			return subject;
		} catch(IOException e) {
			e.printStackTrace();
		} catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		return subject;
	} 
	public static void putObject(Subject subject, String filename) {
		try {
			FileOutputStream file = new FileOutputStream(filename);
			ObjectOutputStream out = new ObjectOutputStream(file);
			
			out.writeObject(subject);
			
			out.close();
			file.close();
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		} 
		
		
	} 
}

