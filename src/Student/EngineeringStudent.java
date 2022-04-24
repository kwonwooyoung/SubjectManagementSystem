package Student;

import java.util.Scanner;

public class EngineeringStudent extends Student {
	
	public void getUserInput(Scanner input) {
		System.out.print("Your ID: ");
		int id = input.nextInt();
		this.setId(id);
		
		System.out.print("Add Subject Name: ");
		String subjectName = input.next();
		this.setSubjectName(subjectName);
		
		System.out.print("Add Subject professor Name: ");
		String professorName = input.next();
		this.setProfessorName(professorName);
	}
}
