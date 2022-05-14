package Student;

import java.util.Scanner;

public class Operation extends Student {
	public Operation(StudentKind kind) {
		super(kind);
	}
	public void getUserInput(Scanner input) {
		setStudentId(input);
		setSubjectName(input);
		setprofessorName(input);
	}
	public void printInfo() {
		String skind = getkind();
		System.out.println("kind : " + skind + " id : " + id  + " " + "subjectName : " + subjectName + " " + "profeesorName : " + professorName);;
	}
}
