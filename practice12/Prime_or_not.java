package nov24_class;

import java.util.Scanner;

public class Prime_or_not {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter a number");
		int num=sc.nextInt();
		boolean flag=true;
		for(int i=2; i<=num; i++)
		{
			if(num%i==0)
			{
				flag=false;
				break;
				
			}
		}
		if(!flag)
		{
			System.out.println(" prime no ");
		}
		else
		{
			System.out.println(" is not prime no");
		}
		
	}

}
