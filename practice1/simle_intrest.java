package assignment1;

import java.util.Scanner;

public class simle_intrest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		
		int principle,time,rate;
		
		System.out.println("enter the principle amount:");
		principle=sc.nextInt();

		
		System.out.println("enter time in year:");
		time=sc.nextInt();
		
		System.out.println("enter the rate of interest:");
		rate=sc.nextInt();
		
		int interest=principle*time*rate/100;
		
		System.out.println("the simple interest is:"+interest);
		
		//total amount with interest
		int tot=principle+interest;
		System.out.println("the total amount with simple interest is:"+tot);



        
		

	}

}
