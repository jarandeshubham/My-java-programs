package velocity;

import java.util.Scanner;

public class EncapsulationTest {

	void getStudentInformation()
	{
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("enter id number");
		int id=scanner.nextInt();
		
		System.out.println("enter first name");
		String fname=scanner.next();
		
		System.out.println("enter last name");
		String lname=scanner.next();
		
		System.out.println("enter city name");
		String city=scanner.next();
		
		
		// to set student information 
		
		Encapsulation encapsulation=new Encapsulation();
		encapsulation.setId(id);
		encapsulation.setFirstName(fname);
		encapsulation.setLastName(lname);
		encapsulation.setCityName(city);
		
		
		//to get student information
		
		System.out.println("student id is: "+encapsulation.getId());
		System.out.println("first name: "+encapsulation.getFristName());
        System.out.println("last name: "+encapsulation.getLastName());
        System.out.println("city name: "+encapsulation.getCityName());

	}
	
	public static void main(String[] args) {
		
		EncapsulationTest encapsulationTest=new EncapsulationTest();

		encapsulationTest.getStudentInformation();
		
	}

}
