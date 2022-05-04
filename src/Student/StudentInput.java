package Student;

import java.util.Scanner;

public interface StudentInput {
	public void getUserInput(Scanner input);
	
	public int getId();
	
	public String getSubjectName();
	
	public String getProfessorName();
	
	public void setSubjectName(String subjectName);
	
	public void setProfessorName(String professorName);
	
	public void printInfo();
	

}
