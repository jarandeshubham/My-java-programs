package nov20_class;

import java.util.Scanner;

public class Positive_negative_no {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number ");
		int number=sc.nextInt();
		
		if (number>0)
		{
			System.out.println(number+" is positive number");
		}
		else if(number<0)
		{
			System.out.println(number+" is negative number");
			
		}
		
		else
		{
			System.out.println("entered number is zero");
		}
			
	}

}
