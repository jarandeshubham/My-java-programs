package assignment1;

import java.util.Scanner;

public class division {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc= new Scanner(System.in);
		int num1,num2;
		
		System.out.println("enter first number:");
		num1=sc.nextInt();
		
		System.out.println("enter second number:");
		num2=sc.nextInt();
		
		
		int div=num1/num2;
		System.out.println("the division of two numbers is:"+div);



   
	}

}
