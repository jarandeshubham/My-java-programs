package nov23_revision;

import java.util.Scanner;

public class Factorial_using_for {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner (System.in);
		System.out.println("enter a number");
		int number=sc.nextInt();
		int temp=number;
		int i=number;
		
		for(i=number; i>=1; i--)
		{
			int fact=temp*i;
			System.out.println("the factorial is "+fact);


		}
		
	
	}

}
