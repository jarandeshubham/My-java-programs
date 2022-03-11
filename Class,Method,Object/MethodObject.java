package methodObject;

import java.util.Scanner;

public class MethodObject
{
  public void add()
  {
	  Scanner sc=new Scanner(System.in);
	  System.out.println("enter first number");
	  int a=sc.nextInt();
	  
	  System.out.println("enter second number");
	  int b=sc.nextInt();
	  
	  int c=a+b;
	  System.out.println("addition is "+c);
  }
}
