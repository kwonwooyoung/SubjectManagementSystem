import java.util.Scanner;

public class Student {
	int number;
	String subjectName;
	int id;
	String professorName;
	public Student() {
		
	}

	public Student(int id) {
		this.id =  id;
	}
	public Student(String subjectName, int id, String professorName) {
		this.subjectName = subjectName;
		this.id =  id;
		this.professorName = professorName;
	}
	public void printInfo() {
		System.out.println("id : " + id  + " " + "subjectName : " + subjectName + " " + "profeesorName : " + professorName);;
	}

}
