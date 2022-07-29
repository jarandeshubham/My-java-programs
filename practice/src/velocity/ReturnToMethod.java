package velocity;

import java.util.Scanner;

public class ReturnToMethod {

	
	private String fname;
	private String lname;
	private int id;
	
	@Override
	public String toString() {
		return "Employee [first name=" +fname  + ", last name=" + lname + ", id=" + id + "]";
	}


	public ReturnToMethod getStudentInfo(String fname, String lname, int id)
	{
		ReturnToMethod returnToMethod=new ReturnToMethod();
		
		returnToMethod.fname=fname;
		returnToMethod.lname=lname;
		returnToMethod.id=id;
		return returnToMethod;
		
	}	
		
	public static void main(String[] args) {
	
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter first name");
		String firstname=scanner.next();
		
		System.out.println("enter last name");
		String lastname=scanner.next();
		
		System.out.println("enter id number");
		int idnum=scanner.nextInt();
		
		ReturnToMethod rmethod=new ReturnToMethod();
		
		ReturnToMethod c=rmethod.getStudentInfo(firstname, lastname, idnum);
		
		System.out.println(c);
		
	}

}
