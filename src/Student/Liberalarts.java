package Student;

import java.util.Scanner;

public class Liberalarts extends Student implements StudentInput {
	public Liberalarts(StudentKind kind) {
		super(kind);
	}
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
	public void printInfo() {
		String skind = "none";
		switch(this.kind) {
		case Engineering:
			skind = "ENG";
			break;
		case Operation:
			skind = "OPR";
			break;
		case Medical:
			skind = "MED";
			break;
		case Liberalarts:
			skind = "LIB"; 
			break;
		default:
			
		}
		System.out.println("kind : " + skind + " id : " + id  + " " + "subjectName : " + subjectName + " " + "profeesorName : " + professorName);;
	}
}
