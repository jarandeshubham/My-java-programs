package assignment2;

import java.util.Scanner;

public class area_of_circle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   
		Scanner sc = new Scanner(System.in);

       float radius;
       System.out.println("enter the radius of circle:");
       radius=sc.nextFloat();
       
       float area=(float)3.14*(radius*radius);
       System.out.println("area of circle is:"+area);
       
       float perimeter=(float) (2*(3.14)*radius);
       System.out.println("perimeter of circle is:"+perimeter);



       
	}

}













