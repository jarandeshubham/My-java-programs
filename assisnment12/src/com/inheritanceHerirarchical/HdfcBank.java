package com.inheritanceHerirarchical;

import java.util.Scanner;

public class HdfcBank extends Bank {

	void getHdfcDetails()
	{
		Bank bank=new Bank();
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter principle amount");
		bank.principleAmount=scanner.nextDouble();
		
		System.out.println("enter tenure");
		bank.tenure=scanner.nextInt();
		
		System.out.println("enter rate of interest");
		bank.rateOfInterest=scanner.nextFloat();
		
		System.out.println("HDFC Bank interest>>"+getCalculateInterest(bank.principleAmount,bank.tenure,bank.rateOfInterest));
		
	}

	double getCalculateInterest(double Pa, int t,float r)
	{
		double interest=Pa*t*r/100;
		return interest;
	}
}
