package string_java;

import java.util.Scanner;

public class RemoveCharFromString {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		String s="shubham";
		Scanner sc=new Scanner(System.in);
		System.out.println("enter char which you want to remove");
		char ch=sc.next().charAt(0);
		int count=0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)!=ch)
			{
				System.out.print(s.charAt(i));
			}
			
		}
		
	}

}
