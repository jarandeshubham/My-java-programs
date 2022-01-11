package nov20_class;

import java.util.Scanner;

public class Alphabet_digit_Unicode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter a character value");
		char ch=sc.next().charAt(0);
				
		if((ch>=65 && ch<=90)||(ch>=97 && ch<=122))
		{
			System.out.println(ch+" entered character is alphabet:");
		}
		else if (ch>=48 && ch<=57)
		{
			System.out.println(ch+" entered character is digit:");
		}
		else
		{
			System.out.println("entered character is a symbol ");
		}
	}

}
