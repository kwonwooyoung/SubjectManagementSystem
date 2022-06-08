package listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import gui.SubjectAdder;
import gui.SubjectViewr;
import gui.WindowFrame;

public class ButtonAddListener2 implements ActionListener {
	WindowFrame frame;
	
	public ButtonAddListener2(WindowFrame frame) {
		this.frame = frame;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		JButton b = (JButton) e.getSource();
		SubjectAdder adder = frame.getSubjectadder();
		frame.setupPanel(adder);
	}
}
