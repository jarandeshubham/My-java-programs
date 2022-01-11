package nov19_class;

import java.util.Scanner;

public class Days_of_week {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		Scanner sc=new Scanner(System.in);
		
		int day;
		
		System.out.println("enter days between 1-7");
		day=sc.nextInt();
		
		if(day==1)
		{
			System.out.println("monday");
		}
		else if(day==2)
		{
			System.out.println("tuesday");
		}
		else if(day==3)
		{
			System.out.println("wednesday");
		}
		else if(day==4)
		{
			System.out.println("thursday");
		}
		else if(day==5)
		{
			System.out.println("friday");
		}
		else if(day==6)
		{
			System.out.println("saturday");
		}
		else if(day==7)
		{
			System.out.println("sunday");
		}
		else
		{
			System.out.println("enter a valid number");
		}
	}

}
