package com.InheritnceMultilevel;

import java.util.Scanner;

public class TermPolicy extends LifeInsurance{

	int duration;
	
	void getTermPolicyInformation()
	{
		getLifeInsuranceInformation();
	System.out.println();
	  Scanner scanner=new Scanner(System.in);
	  System.out.println("enter duration");
	  duration=scanner.nextInt();
	  
	  getTermPolicyDetails(duration);
		
	}
	
	
		void getTermPolicyDetails(int du)
	{
		System.out.println("Term policy duration is>>"+du);
	}
	
	
}
