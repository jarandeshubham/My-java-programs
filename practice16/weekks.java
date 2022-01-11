package program;

import java.util.Scanner;

public class weekks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter days");
		int days=sc.nextInt();
		int a=days/7;
		int b=days%7;
		if(days>0)
			
		{
			
			System.out.println("the weeks are "+a);
			
			System.out.println("the days are "+b);

		}
			}

}
