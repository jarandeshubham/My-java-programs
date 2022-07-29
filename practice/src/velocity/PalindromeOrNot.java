package velocity;

import java.util.Scanner;

public class PalindromeOrNot {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the number");
		int number=scanner.nextInt();
		//number=245
		int temp=number;// temp=245
		
		int rev=0;
		while(number>0)
		{
			int rem=number%10;
			rev=rev*10+rem;
			number=number/10;
		}
		System.out.println("temp="+temp);
		System.out.println("reverse="+rev);
		
		
		if(temp==rev)
		{
			System.out.println(temp+" is palindrome number");
		}
		else
		{
			System.out.println(temp+" is not palindrome number");
		}

	}

}
