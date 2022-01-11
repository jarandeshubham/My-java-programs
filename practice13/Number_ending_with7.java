package nov25_class;

import java.util.Scanner;

public class Number_ending_with7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the number 100 and above");
		int num1=sc.nextInt();
		
		System.out.println("enter the number 200 below");
		int num2=sc.nextInt();
		
		for(int i=num1; i<=num2; i++)
		{
			if(i%10==7)
			{
				System.out.println(i);
			}
		}
	
	}

}
