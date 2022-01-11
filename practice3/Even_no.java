package nov18_class;

import java.util.Scanner;

public class Even_no {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int number=sc.nextInt();
		
		if((number%2)==0)
		{
			System.out.println("the given number " + number + " is even");
		}
		else
		{
			System.out.println("the given number "+number+" is odd");
		}
		}

}
