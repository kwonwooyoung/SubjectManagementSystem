package listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import javax.swing.JTextField;

import Student.EngineeringStudent;
import Student.StudentInput;
import Student.StudentKind;
import manager.Subject;

public class StudentAdderListener implements ActionListener{

	JTextField fieldID;
	JTextField fieldSubjectName;
	JTextField fieldProfessorName;
	
	Subject subject;
	
	public StudentAdderListener(
			JTextField fieldID, 
			JTextField fieldSubjectName, 
			JTextField fieldProfessorName,
			Subject subject) {
		this.fieldID = fieldID;
		this.fieldSubjectName = fieldSubjectName;
		this.fieldProfessorName = fieldProfessorName;
		this.subject = subject;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println(fieldID.getText());
		System.out.println(fieldSubjectName.getText());
		System.out.println(fieldProfessorName.getText());
		
		StudentInput student = new EngineeringStudent(StudentKind.Engineering);
		student.setId(Integer.parseInt(fieldID.getText()));
		student.setSubjectName(fieldSubjectName.getText());
		student.setProfessorName(fieldProfessorName.getText());
		subject.add(student);
		putObject(subject, "subject.ser");
		student.printInfo();
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
