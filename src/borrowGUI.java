import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

public class borrowGUI extends JFrame {
	
	JavaDB conn = new JavaDB("localhost", "root", "", "library");
	//private JComboBox<String> students;
	JComboBox<String> students = new JComboBox<String>();
	
	public borrowGUI(){
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocation(100, 100);
		setPreferredSize(new Dimension(600, 500));
		setLayout(new BorderLayout());
		JPanel background = new JPanel();
		background.setLayout(new FlowLayout());
		background.setPreferredSize(new Dimension(600, 450));
		background.setBorder(new LineBorder(new Color(200, 200, 43), 5));
		add(background);
		background.add(students);
		studentsList();
		pack();
		setVisible(true);
		
	}
	
	private Object[][] studentsList(){
		
		Object[][] data = conn.getData("select *from student");
		Object[][] matris = new Object[data.length][];
		for(Object[] row : data) {
			
			students.addItem(row[1].toString() + " " + row[2].toString());
			
		}
		
		return matris;
		
	}

}
