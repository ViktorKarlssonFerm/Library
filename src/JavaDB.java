import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

import javax.swing.JOptionPane;

public class JavaDB {
	
	private Connection con;
	Object[]fields;
	
	public JavaDB(String host, String user, String password, String database){
		
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
			con = DriverManager.getConnection("jdbc:mysql://" + host + "/" + database + "?useTimezone=true&serverTimezone=UTC", user, password);
			
		}catch(Exception error) {
			
			System.out.println(error);
			
		}
		
	}
	
	public Object[][] getData(String SQL){
		
		Object[][]data = null;
		try {
			
			Statement statement = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
			ResultSet rs = statement.executeQuery(SQL);
			ResultSetMetaData md = rs.getMetaData();
			fields = new Object[md.getColumnCount()];
			for(int i = 0; i < fields.length; i++) {
				
				fields[i] = md.getColumnName(i + 1);
				System.out.println(fields[i]);
				
			}
			int amountOfRows = 0;
			while(rs.next()) {
				
				amountOfRows++;
				
			}
			data = new Object[amountOfRows][md.getColumnCount()];
			rs.beforeFirst();
			int row = 0;
			while(rs.next()) {
				
				for(int j = 0; j < md.getColumnCount(); j++) {
					
					data[row][j] = rs.getString(j + 1);
					
				}
				
				row++;
				
			}
			
		}catch(Exception error) {
			
			JOptionPane.showMessageDialog(null, error);
			
		}
		
		return data;
		
	}
	
	public Object[] getFields() {
		
		return fields;
		
	}
	
	public void execute(String SQL) {
		
		try {
			
			Statement statement = con.createStatement();
			statement.execute(SQL);
			
		}catch(Exception error) {
			
			JOptionPane.showMessageDialog(null, error);
			
		}
		
	}
	
}
