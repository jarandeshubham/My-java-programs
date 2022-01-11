package nov20_revision;

import java.util.Scanner;

public class Alpha_digit_unicode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter a character value");
		char ch=sc.next().charAt(0);
		
		if (ch>=65 && ch<=90) 
		{
			System.out.println(ch+" is uppercase value");
		}
		else if (ch>=97 && ch<=122)
		{
			System.out.println(ch+" is lowercase value");
		}
		else if(ch>=48  && ch<=57)
		{
			System.out.println(ch+" is digit");
		}
		else
		{
			System.out.println("this is symbol value ");
		}
		
	}

}
