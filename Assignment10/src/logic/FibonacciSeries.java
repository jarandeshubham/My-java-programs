package logic;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the number");
		int number=scanner.nextInt();
		
		int firstnum=0;
		int secondnum=1;
		int nextnum;
		
		for(int i=1;i<=number;i++)
		{
			System.out.println(firstnum);
			nextnum=firstnum+secondnum;
			firstnum=secondnum;
			secondnum=nextnum;
		}

	}

}
