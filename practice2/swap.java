package assignment2;

import java.util.Scanner;

public class swap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1,num2;
		num1=101;
		num2=202;
		System.out.println("before swapping the value of num1:"+num1);
		System.out.println("before swapping the value of num2:"+num2);
		int temp=0;
		temp=num1;
		num1=num2;
		num2=temp;
		System.out.println("after swapping the value of num1:"+num1);
		System.out.println("after swapping the value of num2:"+num2);
	}

}
