package nov23_revision;

import java.util.Scanner;

public class Even_odd_for {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		
		int num1,num2;
		
		System.out.println("enter number first");
		num1=sc.nextInt();
		
		System.out.println("enter second no");
		num2=sc.nextInt();
		
		int i=num1;
		
		for(i=num1; i<=num2; i++)
		{
			if(i%2==0)
			{
			  System.out.println(i+" is even no");	
			}
			
			
		}
		for(i=num1; i<=num2;i++)
		{
			if(i%2!=0)
			{
				System.out.println(i+ " is odd no");
			}
		}
		
	}

}
