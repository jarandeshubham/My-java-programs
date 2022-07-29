package com.InheritnceMultilevel;

import java.util.Scanner;

public class Insurance {

	int id;
	String personName;
	String insuranceCompany;
	
	void getInsuranceInformation()
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter id");
		id=scanner.nextInt();
		
		System.out.println("enter person name");
		personName=scanner.next();
		
		System.out.println("enter insurance company name");
		insuranceCompany=scanner.next();
		System.out.println();
		
		getInsuranceDetails(id,personName,insuranceCompany);
		
	}
	
	void getInsuranceDetails(int id, String pName, String iCompany)
	{
		System.out.println("insurance id is>>"+id);
		
		System.out.println("person name is>>"+pName);
		
		System.out.println("company name is>>"+iCompany);
	}
}
