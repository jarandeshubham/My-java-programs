package nov18_revision;

import java.util.Scanner;

public class Great_no_from_two {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("enter fitst number");
		int num1=sc.nextInt();
		
		System.out.println("enter second number");
		int num2=sc.nextInt();
		
		if(num1>num2)
		{
			System.out.println(num1+"is greater");
		}
		else
		{
			System.out.println(num2+  " is greater");
		}
		
	}

}
