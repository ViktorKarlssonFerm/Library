import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class gui extends JFrame{
	
public gui() {
		
		setPreferredSize(new Dimension(1000, 600));
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		JPanel pane = new JPanel();
		pane.setLayout(new BorderLayout(0, 0));
		pane.setBackground(new Color(255,0,0));
		setTitle("Library");
		pack();
		setVisible(true);
		
	}
	
}
