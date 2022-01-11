package nov18_revision;

import java.util.Scanner;

public class Temperature_in_Farenheit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

    Scanner sc = new Scanner(System.in);
		
		float farenheit,celcius;
		
		
		System.out.println("enter temperature in celcius:");
		celcius=sc.nextFloat();
		farenheit=((celcius*9)/5)+32;
		System.out.println("Temperature  in faherenheit is:"+farenheit);

	}

}
