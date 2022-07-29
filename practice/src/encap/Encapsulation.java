package encap;

public class Encapsulation {

	private String name;
	private int studentId;
	
	
	public void setStudentName(String s)
	{
		name=s;
	}
	
	public String getStudentName()
	{
		return name;
	}
	
	public void setStudentId(int d)
	{
		if(d>0)
		{
			studentId=d;
		}
		else
		{
			System.out.println("enter valid id number");
		}
	}
	
	public int getStudentId()
	{
		return studentId;
	}
}
