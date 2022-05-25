package gui;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

public class SubjectAdder extends JFrame {
	public SubjectAdder() {
		JPanel panel = new JPanel();
		panel.setLayout(new SpringLayout());
		
		JLabel labelID = new JLabel("ID: ", JLabel.TRAILING);
		JTextField fieldID = new JTextField(10);
		labelID.setLabelFor(fieldID);
		panel.add(labelID);
		panel.add(fieldID);
		
		JLabel labelsubjectname = new JLabel("SubjectName: ", JLabel.TRAILING);
		JTextField fieldsubjectname = new JTextField(10);
		labelsubjectname.setLabelFor(fieldsubjectname);
		panel.add(labelsubjectname);
		panel.add(fieldsubjectname);
		
		JLabel labelprofeesorname = new JLabel("ProfeesorName: ", JLabel.TRAILING);
		JTextField fieldprofeesorname = new JTextField(10);
		labelprofeesorname.setLabelFor(fieldprofeesorname);
		panel.add(labelprofeesorname);
		panel.add(fieldprofeesorname);
		
		panel.add(new JButton("save"));
		panel.add(new JButton("cancel"));
		
		SpringUtilities.makeCompactGrid(panel, 4, 2, 6, 6, 6, 6);
		
		this.setSize(300, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		this.setContentPane(panel);
		this.setVisible(true);
	}

}
