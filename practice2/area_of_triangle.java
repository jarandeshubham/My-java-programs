package assignment2;

import java.util.Scanner;

public class area_of_triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		
		System.out.println("enter side of an equilateral triangle: ");
		int side=sc.nextInt();

		int area=(int)((Math.sqrt(3)/4)*(side*side));
		System.out.println("Area of an equilateral triangle is:"+area);

	}

}










