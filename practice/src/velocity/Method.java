package velocity;

import java.util.Scanner;

public class Method {

	int a;
	int b;
	int c;
	
	
	void add(int d, int e)
	{
		int k;
		k=d;
		this.a=d;
		this.b=e;
		this.c=a+b;
		System.out.println("addition is:"+c);
	}
	
	void sub(int d, int e)
	{
		this.a=d;
		this.b=e;
		this.c=a-b;
		System.out.println("substraction is:"+c);
	}
	
	void mult(int d,int e)
	{
		this.a=d;
		this.b=e;
		c=a*b;
		System.out.println("multiplication is:"+c);
	}
	
	void div()
	{
		c=a/b;
		System.out.println("division is:"+c);
	}
	static 
	{
		System.out.println("i am static");
	}
	
	Method()
	{
	    System.out.println("i am constructor");	
	}
	
	public static void main(String[] args) {
		
		System.out.println("this is main method");
		Method method=new Method();
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter first number");
		int a=scanner.nextInt();
		System.out.println("enter second number");
		int b=scanner.nextInt();
		
		method.add(a, b);
		method.sub(a, b);
		method.mult(a, b);
		method.div();
		
	}
}
