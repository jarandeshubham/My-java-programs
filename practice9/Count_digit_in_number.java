package nov22_class;

import java.util.Scanner;

public class Count_digit_in_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter a number");
		int number=sc.nextInt();
		
		int count=0;
		
		while(number!=0)
		{
			number=number/10;
			count++;
		}
		
		System.out.println("number of digits:"+count);
	}

}
