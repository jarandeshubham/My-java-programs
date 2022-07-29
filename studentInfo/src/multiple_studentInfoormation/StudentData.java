package multiple_studentInfoormation;

public class StudentData {

	private int id;
	private String fname;
	private String lname;
	
	
	public void setStudentInfo(int id, String firstname, String lastname )
	{
		this.id=id;
		this.fname=firstname;
		this.lname=lastname;
	}
	
	public int getStudentid()
	{
		return id;
	}
	
	public String getStudentname()
	{
		return fname;
	}
	
	public String getStudentsirname()
	{
		return lname;
	}
}
