package Student;
import java.util.Scanner;

public abstract class Student {
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

	public abstract void printInfo(); 

}
