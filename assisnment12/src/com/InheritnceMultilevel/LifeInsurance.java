package com.InheritnceMultilevel;

import java.util.Scanner;

public class LifeInsurance extends Insurance {

	int premiumAmount;
	
	void getLifeInsuranceInformation()
	{
		
		getInsuranceInformation();
		System.out.println();
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter premium amount");
		premiumAmount=scanner.nextInt();
		
		 getLifeInsuranceDetails(premiumAmount);
	}
	
	 void getLifeInsuranceDetails(int pa)
	 {
		System.out.println("premium amount is>>"+pa); 
	 }
}
