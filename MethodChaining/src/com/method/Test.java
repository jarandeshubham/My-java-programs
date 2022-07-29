package com.method;

public class Test extends MethodTest {

	/*void x3()
	{
		System.out.println("this is x3 method super class");
	}*/
	
	void x1()
	{
		System.out.println("this is x1 method sub class");
	}
	void x2()
	{
		System.out.println("this is x2 method sub class");
	}
	
	void x5()
	{
		System.out.println("this is x5 method sub class");
	}
	void x4(int a)
	{
		System.out.println(a);
		this.x2();
	    super.x1();
		this.x3();
		
	}
	
	public static void main(String[] args) {
		
		Test test=new Test();
		
		test.x4(10);
	}
}
