package methods;

import java.util.Scanner;

public class FactorsOfNumber 
{
	void getfactor(int num)
	{
		for(int i=1;i<num;i++)
		{
			if(num%i==0)
			{
				System.out.print(i+",");
			}
		}
	}

	public static void main(String[] args) {
		
		FactorsOfNumber factorsofnumber=new FactorsOfNumber();
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter a number");
		int number=scanner.nextInt();
				
		factorsofnumber.getfactor(number);

	}

}
