package nov23_class;

import java.util.Scanner;

public class Power {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		
		int exp,base,power;
		System.out.println("enter base value");
		base=sc.nextInt();
		
		System.out.println("enter exponent value");
		exp=sc.nextInt();
		
		power=1;
		
		while(exp>0)
		{
			power=base*power;
			exp--;
		}
		System.out.println("the power is "+power);
	}

}
