package nov18_class;

import java.util.Scanner;

public class greater_no_from_threen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
	       System.out.println("enter first no:");
	       int num1=sc.nextInt();
	       
	       System.out.println("enter second no:");
	       int num2=sc.nextInt();
	       
	       System.out.println("enter third no:");
	       int  num3=sc.nextInt();
	       
	       if((num1>num2)&&(num1>num3))
	       
	       
	    	   {
	    		   System.out.println(num1+" is greater");
	    	   }
	       
	       
	       else if((num2>num1)&&(num2>num3))
	       {
	    	   System.out.println(num2+" is greater");
	       }
	       
	       else if((num3>num1)&&(num3>num2))
	    	   {
	    		   System.out.println(num3+" is greater");
	    	   }
	       
	       
	       	}

}
