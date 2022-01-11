package program;

import java.util.Scanner;

public class Practic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		for(int i=1; i<=10;i++)
		{
			System.out.println(5+" * "+i+" = "+ i*5);
		}
		*/
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter a number ");
		int number=sc.nextInt();
		
		System.out.println("enter a string");
		String ch=sc.next();
		
		number=number*2;
		
		System.out.println(number);
		System.out.println(ch);
	}

}
