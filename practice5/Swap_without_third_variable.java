package nov19_class;

import java.util.Scanner;

public class Swap_without_third_variable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1,num2;
		Scanner sc= new Scanner (System.in);
		
		System.out.println("enter first number:");
		num1=sc.nextInt();
		
		System.out.println("enter second number:");
		num2=sc.nextInt();
		System.out.println("before swapping num1 is:"+num1);
		System.out.println("before swapping num2 is:"+num2);

		num1=num1+num2;
		num2=num1-num2;
		num1=num1-num2;
		System.out.println(" after swapping num1 is:"+num1);
		System.out.println(" after swapping num2 is:"+num2);
		
		/*a= 5 b=10
			
         a=a+b=15
         a=15 b=10
         b=a-b
           15-10=5
         a=a-b
           15-5=10
       */
	}      
}
