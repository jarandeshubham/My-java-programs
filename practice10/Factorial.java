package nov23_class;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//6!
		Scanner sc=new Scanner(System.in);
		
		int num;
		
		System.out.println("enter number");
	     num=sc.nextInt();
		
		int fact=1;
	  while(num>0)
	  {
		  fact=num*fact;
		  num--;
	  }
		
	  System.out.println("the factorial is "+fact );

	}

}
