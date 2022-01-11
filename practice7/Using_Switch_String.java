package nov20_class;

import java.util.Scanner;

public class Using_Switch_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner (System.in);
		
		System.out.println("enter a technology of your choice from the foloowing");
		System.out.println("C/C++/JAVA/PYTHON");
		
		String tech;
		tech=sc.next();
		
		switch (tech)
		{
		case "C":System.out.println("you have selected C");
		  break;
		case "C++":System.out.println("you have selected C++");
		break;

		case "JAVA":System.out.println("you have selected JAVA");
		  break;
		case "PYTHON":System.out.println("you have selected PYTHON");
		break;
		}
	}

}
