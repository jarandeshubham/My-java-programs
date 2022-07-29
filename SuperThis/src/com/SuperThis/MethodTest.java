package com.SuperThis;

public class MethodTest extends MethodDemo1 {

	int c=20;
	int b=25;
	void x4()
	{
		System.out.println("this is x4 method sub class");
	}
	
	void x4(String a)
	{
	
		System.out.println("this is x4 single parameter method sub class");
	}
	
	void x5()
	{
		this.x2(this);
		
		this.x4();
		
		System.out.println("this is x5 method sub class");
	}
	
	public static void main(String[] args) {
		
		MethodTest methodTest=new MethodTest();
		
		methodTest.x5();
				
	}
	
}
