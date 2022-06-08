package gui;
import javax.swing.JFrame;
import javax.swing.JPanel;

import manager.Subject;

public class WindowFrame extends JFrame{
	Subject subject;
	ManuSelection menuselection;
	SubjectAdder subjectadder;
	SubjectViewr subjectviewer;
	public WindowFrame(Subject subject) {
		this.setSize(500, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("My Frame");
		this.subject = subject;
		this.menuselection = new ManuSelection(this);
		this.subjectadder = new SubjectAdder(this, this.subject);
		this.subjectviewer = new SubjectViewr(this, this.subject); 
		this.setupPanel(menuselection);
		this.setVisible(true);
	}
	public void setupPanel(JPanel panel) {
		this.getContentPane().removeAll();
		this.getContentPane().add(panel);
		this.revalidate();
		this.repaint();
	}
	public ManuSelection getMenuselection() {
		return menuselection;
	}
	public void setMenuselection(ManuSelection menuselection) {
		this.menuselection = menuselection;
	}
	public SubjectAdder getSubjectadder() {
		return subjectadder;
	}
	public void setSubjectadder(SubjectAdder subjectadder) {
		this.subjectadder = subjectadder;
	}
	public SubjectViewr getSubjectviewer() {
		return subjectviewer;
	}
	public void setSubjectviewer(SubjectViewr subjectviewer) {
		this.subjectviewer = subjectviewer;
	}
}
