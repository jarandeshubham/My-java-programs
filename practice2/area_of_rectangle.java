package assignment2;

import java.util.Scanner;

public class area_of_rectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the length of rectangle:");
		int length=sc.nextInt();
		 
		System.out.println("enter the breath of rectangle: ");
		int breath=sc.nextInt();
		
	int area=length*breath;
	System.out.println("the area of rectangle is : "+area);
	
	int perimeter=2*(length+breath);
	System.out.println("the perimeter of rectangle is: "+perimeter);
	
	}

}
