package multiple_studentInfoormation;

import java.util.Scanner;

public class SetInfo extends StudentData {

	static Scanner scanner=new Scanner(System.in);
	void studentinfo()
	{
      System.out.println();
      System.out.println("enter student id");
      int id=scanner.nextInt();
      
      System.out.println("enter student first name");
      String fname=scanner.next();
      
      System.out.println("enter student last name");
      String lname=scanner.next();
      
      SetInfo setinfo=new SetInfo();
      
      setinfo.setStudentInfo(id, fname, lname);
      
      System.out.println("Student id is:"+setinfo.getStudentid());
      System.out.println("First name:"+setinfo.getStudentname());
      System.out.println("last name:"+setinfo.getStudentsirname());

	}
	
	public static void main(String[] args) {
		
		System.out.println("enter how many student data you want to add");
		int number=scanner.nextInt();
		
		for(int i=1;i<=number;i++)
		{
			SetInfo setinfo=new SetInfo();
			setinfo.studentinfo();
		}
	}
}
