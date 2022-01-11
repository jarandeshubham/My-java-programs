package nov20_revision;

import java.util.Scanner;

public class Using_string_swithccase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner (System.in);
		String tech=sc.next();
		
		System.out.println("enter a technology from following choice");
		System.out.println("C/CPP/JAVA/PYTHON");
		
	    switch (tech)
	    {
	    case "C": System.out.println("you selected C technology");
	    break;
	    case "CPP":System.out.println("you selected CPP technology");
	    break;
	    case "JAVA":System.out.println("you selected JAVA technology");
	    break;
	    case "PYTHON" :System.out.println("you selected PYTHON technology");
	    break;
	    default :System.out.println("enter valid technology");
	    }
	}
}
