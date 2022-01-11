package nov20_class;

import java.util.Scanner;

public class Profit_loss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		Scanner sc=new Scanner (System.in);
		

		System.out.println("enter cost price");
		int cost=sc.nextInt();
		
		System.out.println("enter selling price");
		int selling=sc.nextInt();
		
		if((selling-cost)>0)
		{
			System.out.println("profit of "+(selling-cost));
		}
		else if((selling-cost)<0)
		{
			System.out.println("loss of "+(cost-selling));
		}
		else
		{
			System.out.println("Breakeven");
		}
		
	}

}
