package assignment2;

import java.util.Scanner;

public class user_input {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);


		System.out.println("enter a number:");
		int num1=sc.nextInt();
		System.out.println("the number entered is: "+num1);


		System.out.println("the enter float value: ");
		float num2=sc.nextFloat();
		System.out.println("the entered float value is:"+num2);


		System.out.println("enter double value: ");
		double num3=sc.nextDouble();
		System.out.println("the number entered double value is: "+num3);


		System.out.println("enter string value:");
		String str1=sc.next();
		System.out.println("the number entered is: "+str1);


		System.out.println("enter character value: ");
		char ch=sc.next().charAt(0);
		System.out.println("the entered char value is: "+ch);
	}

}
