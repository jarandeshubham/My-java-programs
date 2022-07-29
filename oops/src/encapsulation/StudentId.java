package encapsulation;

import java.util.Scanner;

public class StudentId {

	private int studentId;
	
	public void setStudentId(int id)
	{
		if(id>0)
		{
			studentId=id;
			
		}
		else
		{
			System.out.println("enter valid Id");
		}
	}
	
	public int getStudentId()
	{
		return studentId;
	}
	


}
