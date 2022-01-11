package nov20_revision;

import java.util.Scanner;

public class Profit_loss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner (System.in);
		
		System.out.println("enter cost price: ");
		int cost=sc.nextInt();
		
		System.out.println("enter selling price:");
		int sel=sc.nextInt();
		
		
		
		if((sel-cost)>0)
		{
			System.out.println(" profit of" + (sel-cost));
		}
		else if((cost-sel)>0)
		{
			System.out.println(" loss of " +(cost-sel));
		}
		else
		{
			System.out.println("breakeven");
		}
		
	}

}
