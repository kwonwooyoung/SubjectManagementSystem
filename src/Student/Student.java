package Student;
import java.io.Serializable;
import java.util.Scanner;

public abstract class Student implements StudentInput, Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -3412894054986286802L;
	
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
	
	public void setStudentId(Scanner input) {
		System.out.print("Studnet id: ");
		int id =input.nextInt();
		this.setId(id);
	}
	
	public void setSubjectName(Scanner input) {
		System.out.print("과목을 입력하시오 : ");
		String subjectName = input.next();
		this.setSubjectName(subjectName);
	} 
	
	public void setprofessorName(Scanner input) {
		System.out.print("교수님의 성함을 입력하시오 : ");
		String professorName = input.next();
		this.setProfessorName(professorName);
	}
	public String getkind() {
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
		return skind;
	}

}
