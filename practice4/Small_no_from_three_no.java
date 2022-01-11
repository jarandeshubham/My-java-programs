package nov18_revision;

import java.util.Scanner;

public class Small_no_from_three_no {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc= new Scanner(System.in);
		
		System.out.println("enter first number:");
		int num1=sc.nextInt();
		
		System.out.println("enter second number:");
		int num2=sc.nextInt();
		
		System.out.println("entet third number:");
		int num3=sc.nextInt();
		
		if((num1<num2)&&(num1<num2))
		{
			System.out.println(num1+" is small number");
			
		}
		else  if((num2<num1)&&(num2<num3))
		{
			System.out.println(num2+" is small number");
			
		}
		else if((num3<num1)&&(num3<num2))
		{
			System.out.println(num3+" is small number");
		}
		
	}

}
