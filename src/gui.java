import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

public class gui extends JFrame{
	
public gui() {
		
		setPreferredSize(new Dimension(1000, 600));
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		JPanel form = new JPanel();
		form.setBackground(new Color(0,255,0));
		form.setPreferredSize(new Dimension(250, 250));
		
		JPanel loginform = new JPanel();
		loginform.setPreferredSize(new Dimension(250, 250));
		loginform.setBorder(new LineBorder(new Color(234, 234, 43), 5));
		
		JTextField fnamn = new JTextField();
		fnamn.setPreferredSize(new Dimension(150,30));
		fnamn.setFont(new Font("",Font.PLAIN,18));
		
		JTextField lnamn = new JTextField();
		lnamn.setPreferredSize(new Dimension(150,30));
		lnamn.setFont(new Font("",Font.PLAIN,18));
		
		JButton login = new JButton("Log in");
		login.setPreferredSize(new Dimension(100,30));
		
		setTitle("Library");
		add(form, BorderLayout.WEST);
		form.add(loginform);
		loginform.add(fnamn);
		loginform.add(lnamn);
		loginform.add(login);
		pack();
		setVisible(true);
		
	}
	
}
