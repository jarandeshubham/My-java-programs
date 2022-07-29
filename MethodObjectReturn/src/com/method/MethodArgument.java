package com.method;

public class MethodArgument {

	int a=5;
	int b=4;
	int c;

	@Override
	public String toString() {
		return "MethodArgument [a=" + a + ", b=" + b + ", c=" + c + "]";
	}

	public MethodArgument add(int i,int j)
	 {
		 MethodArgument methodArgument=new MethodArgument();
		 a=i;
		 b=j;
		 methodArgument.c=a+b;
		 return methodArgument;
		 
	 }
	 
	 public static void main(String[] args) {
		
		 MethodArgument mArgument=new MethodArgument();
		 
		 MethodArgument m=mArgument.add(10, 20);
	
		 System.out.println(m);
	}
	
}
