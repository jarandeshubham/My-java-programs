package com.ObjectClass;

public class Getclass {

	int a;
	public static void main(String[] args) {
		
		Getclass getclass=new Getclass();
		getclass.a=15;
		
		System.out.println(getclass.getClass());
		System.out.println(getclass.getClass().getSimpleName());
		System.out.println(getclass.toString());
		System.out.println(getclass.hashCode());
	}
	
}
