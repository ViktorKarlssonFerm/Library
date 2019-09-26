
public class student {
	
	private int studentID;
	private String firstName;
	private String lastName;
	private String personal;
	
	public student(int studentID, String firstName, String lastName, String personal) {
		
		super();
		this.studentID = studentID;
		this.firstName = firstName;
		this.lastName = lastName;
		this.personal = personal;
		
	}

	public int getStudentID() {
		return studentID;
	}

	public void setStudentID(int studentID) {
		this.studentID = studentID;
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

	public String getPersonal() {
		return personal;
	}

	public void setPersonal(String personal) {
		this.personal = personal;
	}
	
	public Object[] getRow() {
		
		Object[] row = {firstName, lastName, personal};
		return row;
		
	}

}
