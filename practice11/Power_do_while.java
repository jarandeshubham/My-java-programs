package nov23_revision;

import java.util.Scanner;

public class Power_do_while {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		
		int base,expo,power;
		
		System.out.println("enter base value");
		base=sc.nextInt();
		
		System.out.println("enter exponent value");
		expo=sc.nextInt();
		
		power=1;
		do
		{
			power=base*power;
			expo--;
			
		}
		while(expo>0);
		System.out.println("power is "+power);

	}

}
