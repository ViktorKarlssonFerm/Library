
public class teacher {
	
	private int teacherID;
	private String firstName;
	private String lastName;
	private String password;
	
	public teacher(int teacherID, String firstName, String lastName, String password) {
		
		this.teacherID = teacherID;
		this.firstName = firstName;
		this.lastName = lastName;
		this.password = password;
		
	}
	
	public int getTeacherID() {
		return teacherID;
	}
	
	public void setTeacherID(int teacherID) {
		this.teacherID = teacherID;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public Object[] getRow() {
		
		Object[] row = {firstName, lastName};
		return row;
		
	}

}
