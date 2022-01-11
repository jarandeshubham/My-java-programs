package nov19_class;

import java.util.Scanner;

public class Type_of_triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc= new Scanner(System.in);
		
		int side1,side2,side3;
		
		System.out.println("enter the value for side1:");
		side1=sc.nextInt();
		
		System.out.println("enter the value for side2:");
		side2=sc.nextInt();
		
		System.out.println("enter the value for side3:");
		side3=sc.nextInt();
		
		if((side1==side2)&&(side2==side3))
		{
			System.out.println("the triangle is Equilateral:");
			
		}
		
		else if((side1==side2) ||(side2==side3)||(side1==side3))
				{
					System.out.println("the triangle is Isosceles:");
					
				}
		else
		{
			System.out.println("the triangle is Scalence:");
		}
	}

}
