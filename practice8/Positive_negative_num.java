package nov20_revision;

import java.util.Scanner;

public class Positive_negative_num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	  Scanner sc= new Scanner(System.in);
	  System.out.println("Enter a number");
	  int num=sc.nextInt();
	  
	  if(num>0)
	  {
		  System.out.println(num+" is positive number");
		  
	  }
	  else if(num<0)
	  {
		  System.out.println(num+" is negative number");
	  }
	  else
	  {
		  System.out.println("number is zero");
	  }
	}

}
