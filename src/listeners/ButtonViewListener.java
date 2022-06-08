package listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

import javax.swing.JButton;

import gui.SubjectViewr;
import gui.WindowFrame;
import manager.Subject;

public class ButtonViewListener implements ActionListener {
	WindowFrame frame;
	
	public ButtonViewListener(WindowFrame frame) {
		this.frame = frame;
	}
	@Override
	public void actionPerformed(ActionEvent e) { 
		SubjectViewr subjectviewer = frame.getSubjectviewer();
		Subject subject = getObject("subject.ser");
		subjectviewer.setSubject(subject);
		
		frame.getContentPane().removeAll();
		frame.getContentPane().add(subjectviewer);
		frame.revalidate();
		frame.repaint();
//		JButton b = (JButton) e.getSource();
//		SubjectViewr viewer = frame.getSubjectviewer();
//		frame.setupPanel(viewer);
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
}
