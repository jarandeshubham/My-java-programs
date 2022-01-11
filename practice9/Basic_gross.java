package nov22_class;

import java.util.Scanner;

public class Basic_gross {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner (System.in);
		
		float basic,gross,hra,da;
		
		System.out.println("enter basic salary");
		basic=sc.nextFloat();
		
		if(basic<=10000)
		{
			hra=basic*0.2f;
			da=basic*0.8f;
			System.out.println("hra is "+hra);
			System.out.println("da is "+da);

		}
		else if(basic<=20000)
		{

			hra=basic*0.25f;
			da=basic*0.9f;
			System.out.println("hra is "+hra);
			System.out.println("da is "+da);
		}
		else
		{

			hra=basic*0.3f;
			da=basic*0.95f;
			System.out.println("hra is "+hra);
			System.out.println("da is "+da);
		}
		
		gross=basic+hra+da;
		System.out.println("gross salary is "+gross);
	}

}
