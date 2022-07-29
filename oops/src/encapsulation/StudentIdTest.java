package encapsulation;

import java.util.Scanner;

public class StudentIdTest {
	
	public void Scan()
	{
      Scanner scanner=new Scanner(System.in);
		
		System.out.println("enter id for student");
		
		int id=scanner.nextInt();
		
		StudentId studentId=new StudentId();
		studentId.setStudentId(id);
		System.out.println("student id is: "+studentId.getStudentId());
		
	}

	public static void main(String[] args) {
	
		StudentIdTest studentIdTest=new StudentIdTest();
		studentIdTest.Scan();


	}

}
