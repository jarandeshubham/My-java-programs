package nov20_class;

import java.util.Scanner;

public class Using_switch_calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner (System.in);
		
		System.out.println("enter first number:");
		int num1=sc.nextInt();
		System.out.println("enter second number:");
		int num2=sc.nextInt();
		
		System.out.println("enter operation ");
		System.out.println("1.addition 2.substraction 3.multiplication 4.division");
		int choice=sc.nextInt();
		
		switch(choice)
		{
		case 1:System.out.println("the addition is:"+(num1+num2));
		break;

		case 2:System.out.println("the substraction is:"+(num1-num2));
		break;

		case 3:System.out.println("the multiplication is:"+(num1*num2));
		break;

		case 4:System.out.println("the division is:"+(num1/num2));
		break;
		default : System.out.println("enter valid choice");
		}
		
		
		
	}

}
