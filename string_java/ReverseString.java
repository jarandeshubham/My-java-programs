package string_java;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter a string");
		String s=sc.next();
		
		int leng=s.length();
	for(int i=0;i<leng;i++)
	{
		System.out.print(s.charAt(i));
	}
	System.out.println();
	for(int i=leng-1;i>=0;i--)
	{
		System.out.print(s.charAt(i));
	}
	}

}
