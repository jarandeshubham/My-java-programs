package nov20_class;

import java.util.Scanner;

public class Using_char_calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner (System.in);
		
		System.out.println("enter first number");
		int num1=sc.nextInt();
		System.out.println("enter second number");
		int num2=sc.nextInt();
		
		System.out.println("enter operation from following");
		System.out.println("+  ,  -  ,  *  ,  /  ");
		
		char ch=sc.next().charAt(0);
		switch (ch)
		{
		case '+':System.out.println("the sum is "+(num1+num2));
          break;
          
		case '-':System.out.println("the sub is "+(num1-num2));
        break;
        
		case '*':System.out.println("the mul is "+(num1*num2));
        break;
        
		case '/':System.out.println("the div is "+(num1/num2));
        break;
		
		}
	}

}
