package inheritance;

import java.util.Scanner;

public class Operations 
{
    
	 Scanner sc=new Scanner (System.in);
	
	 int num1,num2,result;
  
  void get()
  {
	  System.out.println("enter first number ");
	  num1=sc.nextInt();
	  System.out.println("enter second number");
	  num2=sc.nextInt();
  }
  void addition()
  {
	  result=num1+num2;
	  System.out.println("the addition is: "+result);
  }
  void mult()
  {
	  result=num1*num2;
	  System.out.println("the multiplication is: "+result);
  }
  void sum()
  {
	  result=num1-num2;
	  System.out.println("the substration is: "+result);
  }
  void div()
  {
	  result=num1/num2;
	  System.out.println("the dividion is: "+result);
  }
  public static void main (String[] args)
  {
	  Operations r=new Operations();
	  r.get();
	  r.addition();
	  r.mult();
	  r.sum();
	  r.div();
	  
  }
}

