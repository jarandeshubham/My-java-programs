package nov20_revision;

import java.util.Scanner;

public class Calculator_using_if_elseif {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter first number=");
		int num1=sc.nextInt();
		
		System.out.println("enter second number=");
		int num2=sc.nextInt();
		
		
		
		
		
		System.out.println("enter choice from following");
		System.out.println("1.addition 2.substraction 3. multiplication 4.division");
		
		int ch;	
		ch=sc.nextInt();
		
		int a=num1+num2;
		int b=num1-num2;
		int c=num1*num2;
		int d=num1/num2;
		
		
			
		if(ch==1)
		{
			System.out.println("the addition is "+a);
		}
		else if(ch==2)
		{
			System.out.println("the substraction is "+b);

		}
		else if(ch==3)
		{
			System.out.println("the substraction is "+c);

		}
		else if(ch==4)
		{
			System.out.println("the substraction is "+d);

		}
	}
		

}
