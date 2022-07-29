package com.velocity;

public class inheritance
{
	void add(int a,int b)
	{
		System.out.println("this is base");
	}
}
class B extends inheritance
{
	void add(int a, int b)
	{
		System.out.println("this is derived");
	}
}

