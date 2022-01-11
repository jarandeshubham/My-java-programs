package nov19_class;

import java.util.Scanner;

public class alpha_digit_Specoalchar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner (System.in);
		System.out.println("enter character ");
		char ch=sc.next().charAt(0);
		if((ch>='a' && ch<='z'))
		{
			System.out.println(ch+" is an lowercase ");
		}
		else if((ch>='A' && ch<='Z'))
		{
			System.out.println(ch+" is an uppercase");
		}
		else if (ch>='0' && ch<='9')
		{
			System.out.println(ch+" is digit");
		}
		else
		{
			System.out.println(ch+" is a special character");
		}
		}

}
