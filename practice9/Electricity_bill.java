package nov22_class;

import java.util.Scanner;

public class Electricity_bill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		
		int units;
		float bill;
		
		System.out.println("Enter electricity units:");
		units=sc.nextInt();
		
		if(units<=50)
		{
			bill=units*0.50f;
			
		}
		
		else if(units>50 && units<=150)
		{
			bill=(units*0.50f)+((units-50)*0.75f);
		}
		
		else if(units>150 && units<=250)
		{
			bill=(50*0.50f)+(100*0.75f)+((units-150)*1.20f);
			
		}
		else
		{
			bill=(50*0.50f)+(100*0.75f)+(100*1.20f)+((units-250)*1.50f);
			
		}
		float surplus,finalbill;
		surplus=bill*0.20f;
		finalbill=bill+surplus;
		
		System.out.println("electric bill="+bill);
		System.out.println("surplus="+surplus);
		System.out.println("final bill="+finalbill);

		
	}

}
