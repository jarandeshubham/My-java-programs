package nov19_class;

import java.util.Scanner;

public class Lower_upper_case {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter a character value:");
		char ch=sc.next().charAt(0);
		
		if((ch>='a')&&(ch<='z'))
		{
			System.out.println(ch+" is a lowercase alphabet");
		}
		
		else if((ch>='A')&&(ch<='Z'))
		{
			System.out.println(ch+" is an uppercase alphabet");
			
		}
		else
		{
			System.out.println(ch+" is not an alphabet ");
		}
	}

}
