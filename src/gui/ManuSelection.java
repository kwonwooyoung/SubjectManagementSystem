package gui;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import listeners.ButtonAddListener2;
import listeners.ButtonViewListener;

public class ManuSelection extends JPanel {
	WindowFrame frame;
	public ManuSelection(WindowFrame frame) {
		this.frame = frame;
		this.setLayout(new BorderLayout());
		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		JLabel label = new JLabel("Menu Selection");
		
		JButton button1 = new JButton("Add Subject");
		JButton button2 = new JButton("Delete Subject");
		JButton button3 = new JButton("Edit Subject");
		JButton button4 = new JButton("view Subject");
		JButton button5 = new JButton("Exit Program");
		 
		button1.addActionListener(new ButtonAddListener2(frame));
		button4.addActionListener(new ButtonViewListener(frame));
		
		panel2.add(label);
		panel1.add(button1);
		panel1.add(button2);
		panel1.add(button3);
		panel1.add(button4);
		panel1.add(button5);
		
		this.add(panel2, BorderLayout.NORTH);
		this.add(panel1, BorderLayout.CENTER);
		this.setVisible(true);
	}

}
 	