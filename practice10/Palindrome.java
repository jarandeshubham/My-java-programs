package nov23_class;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the number");
		int num=sc.nextInt();
		int temp=num;
		int rem,sum=0;
		
		
		
		while(num>0)
		{
			rem=num%10;
			sum=(sum*10)+rem;
			num=num/10;
			
			
		}
		
		if (temp==sum)
		{
			System.out.println("the number is palindrome");
		}
		else
		{
			System.out.println("the number is not palindrome");
		}
	}

}
