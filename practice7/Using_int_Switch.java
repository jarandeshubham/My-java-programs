package nov20_class;

import java.util.Scanner;

public class Using_int_Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter a technology of your choice from following ");
		System.out.println("1.c/2.cpp/3.java/4.python");
		
		int tech;
		tech=sc.nextInt();
		
		switch(tech)
		{
		case 1:System.out.println("you have selected c technology ");
		break;
		case 2:System.out.println("you have selected cpp technology ");
		break;
		case 3:System.out.println("you have selected java technology ");
		break;
		case 4:System.out.println("you have selected python technology ");
		break;

		}
	}

}
