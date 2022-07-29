package com.velocity;

import java.util.Scanner;

public class PrimeNo {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("enter the number ");
		int number=scanner.nextInt();//11
		
		int count=0;
		
		for(int i=2;i<number;i++)  //i=2 i<11
		{
			if(number%i==0)
			{
				count++;
			}
		}
		if(count==0)
		{
			System.out.println(number+" is prime number");
		}
		else
		
			System.out.println(number+" is not prime number ");
		}
	
	}

