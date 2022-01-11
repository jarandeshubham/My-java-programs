package nov22_class;

import java.util.Scanner;

public class Incresing_decreasing_from_threeno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		
		int num1,num2,num3;
		
		System.out.println("enter first number");
		num1=sc.nextInt();
		
		System.out.println("enter second number");
		num2=sc.nextInt();
		
		System.out.println("enter third number");
		num3=sc.nextInt();
		
		if(num1<num2 && num2<num3)
		{
			System.out.println("the numbers are in increasing order");
			
		}
		
		else if(num1>num2 && num2>num3)
		{
			System.out.println("the numbers are in decreasing order");
			
		}
		
		else
		{
			System.out.println("neither in increasing nor decreasing order");
		}


	}

}
