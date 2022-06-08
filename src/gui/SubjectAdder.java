package gui;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

import listeners.StudentAdderListener;
import listeners.SubjectAdderCancelListener;
import manager.Subject;

public class SubjectAdder extends JPanel {
	WindowFrame frame;
	Subject subject;
	public SubjectAdder(WindowFrame frame, Subject subject) {
		this.frame = frame;
		this.subject = subject;
		JPanel panel = new JPanel();
		panel.setLayout(new SpringLayout());
		JLabel labelID = new JLabel("ID: ", JLabel.TRAILING);
		JTextField fieldID = new JTextField(10);
		labelID.setLabelFor(fieldID);
		panel.add(labelID);
		panel.add(fieldID);
		
		JLabel labelsubjectname = new JLabel("SubjectName: ", JLabel.TRAILING);
		JTextField fieldsubjectname = new JTextField(10);
		
		JLabel labelprofeesorname = new JLabel("ProfeesorName: ", JLabel.TRAILING);
		JTextField fieldprofeesorname = new JTextField(10);
		
		labelsubjectname.setLabelFor(fieldsubjectname);
		JButton saveButton = new JButton("save");
		saveButton.addActionListener(new StudentAdderListener(fieldID, fieldsubjectname, fieldprofeesorname, subject));
		
		JButton cancleButton = new JButton("cancel");
		cancleButton.addActionListener(new SubjectAdderCancelListener(frame ));
		panel.add(labelsubjectname);
		panel.add(fieldsubjectname);
		labelprofeesorname.setLabelFor(fieldprofeesorname);
		panel.add(labelprofeesorname);
		panel.add(fieldprofeesorname);
		panel.add(saveButton);
		panel.add(cancleButton);
		
		SpringUtilities.makeCompactGrid(panel, 4, 2, 6, 6, 6, 6);
		
		this.add(panel);
		this.setVisible(true);
	}
}
