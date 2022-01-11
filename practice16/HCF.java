package program;

import java.util.Scanner;

public class HCF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
		
		System.out.println("enter first number");
		int num1=sc.nextInt();
		
		System.out.println("enter second number");
		int num2=sc.nextInt();
		
		System.out.println("enter third number");
		int num3=sc.nextInt();
		
		
		for(int i=num3;i>=1;i--)
		{
			
			if(num2%num1==0 && num3%num1==0)
			{
				System.out.println("HCF is "+num1);
				break;
			}
			
			 if(num1%num2==0 && num3%num2==0)
			{
				System.out.println("HCF is "+num2);
				break;
			}
		     if(num1%num3==0 && num2%num3==0)
			{
				System.out.println("HCF is "+num3);
				break;
			}
		     if(num1%i==0 && num2%i==0 && num3%i==0)
				{
					System.out.println("HCF is "+i);
					break;
				}
		    
		     num3--;
		}
		
	}

}
