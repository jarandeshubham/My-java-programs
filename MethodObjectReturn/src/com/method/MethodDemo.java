package com.method;

public class MethodDemo {

	int id=101;
	String name="shubham";
	String city="Pune";
	
	   
	  @Override
	public String toString() {
		return "MethodDemo [id=" + id + ", name=" + name + ", city=" + city + "]";
	}

	public MethodDemo setData()
	  {
		  MethodDemo methodDemo=new MethodDemo();
		  
		  methodDemo.id=id;
		  methodDemo.name=name;
		  methodDemo.city=city;
		  
		  return methodDemo;
	  }
	  
	  public static void main(String[] args) {
		
		  MethodDemo mDemo=new MethodDemo();
		  MethodDemo s=mDemo.setData();
		  
		  System.out.println(s);
	}
}
