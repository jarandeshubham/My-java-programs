package com.velocity;

import java.util.Scanner;

public class B {


	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the number");
		int number=scanner.nextInt();
		
		int count=0;
		int j=2;
		
		System.out.println("first N prime numbers are:");
		while(count!=number)
		{
			int k=0;
			for(int i=2;i<j;i++)
			{
				if(j%i==0)
				{
					k++;
				}
			}
			if(k==0)
			{
				System.out.println(j);
				count++;
			}
			j++;
		}
	}
	
}
