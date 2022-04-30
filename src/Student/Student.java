package Student;
import java.util.Scanner;

public class Student {
	protected StudentKind kind = StudentKind.Engineering;
	protected int number;
	protected String subjectName;
	protected int id;
	protected String professorName;
	
	public Student() {
		
	}
	public Student(StudentKind kind) {
		this.kind = kind;
	}

	public Student(int id) {
		this.id =  id;
	}
	public Student(String subjectName, int id, String professorName) {
		this.subjectName = subjectName;
		this.id =  id;
		this.professorName = professorName;
	}
	public Student(String subjectName, int id, String professorName, StudentKind kind) {
		this.kind = kind;
		this.subjectName = subjectName;
		this.id =  id;
		this.professorName = professorName;
	}
	public StudentKind getKind() {
		return kind;
	}

	public void setKind(StudentKind kind) {
		this.kind = kind;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getSubjectName() {
		return subjectName;
	}

	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getProfessorName() {
		return professorName;
	}

	public void setProfessorName(String professorName) {
		this.professorName = professorName;
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
