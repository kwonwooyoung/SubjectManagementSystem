package gui;

import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import Student.StudentInput;
import manager.Subject;

public class SubjectViewr extends JPanel {
	WindowFrame frame;
	Subject subject;
	
	
	public Subject getSubject() {
		return subject;
	}


	public void setSubject(Subject subject) {
		this.subject = subject;
		this.removeAll();
		
		DefaultTableModel model = new DefaultTableModel();
		model.addColumn("ID");
		model.addColumn("Subject");
		model.addColumn("Professor");
		model.addColumn("Contact Info.");
		
		for(int i=0; i<subject.size(); i++) {
			Vector row = new Vector();
			StudentInput si = subject.get(i);
			row.add(si.getId());
			row.add(si.getSubjectName());
			row.add(si.getProfessorName());
			model.addRow(row);
		}
		
		JTable table = new JTable(model);
		JScrollPane sp = new JScrollPane(table);
		
		this.add(sp);
	}


	public SubjectViewr(WindowFrame frame, Subject subject) {
		this.frame = frame;
		this.subject = subject;
		
		System.out.println("***" + subject.size() + "***");
		DefaultTableModel model = new DefaultTableModel();
		model.addColumn("ID");
		model.addColumn("Subject");
		model.addColumn("Professor");
		model.addColumn("Contact Info.");
		
		for(int i=0; i<subject.size(); i++) {
			Vector row = new Vector();
			StudentInput si = subject.get(i);
			row.add(si.getId());
			row.add(si.getSubjectName());
			row.add(si.getProfessorName());
			model.addRow(row);
		}
		
		JTable table = new JTable(model);
		JScrollPane sp = new JScrollPane(table);
		
		this.add(sp);
	}

}
