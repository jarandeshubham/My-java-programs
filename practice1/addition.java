package assignment1;

import java.util.Scanner;

public class addition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   
		Scanner sc= new Scanner(System.in);
		int num1,num2;
		
		System.out.println("enter first number:");
		num1=sc.nextInt();
		
		System.out.println("enter second number:");
		num2=sc.nextInt();
		
		
		int sum=num1+num2;
		System.out.println("the addition of two numbers is:"+sum);



   
	}

}
