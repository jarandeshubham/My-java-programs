package nov18_revision;

import java.util.Scanner;

public class Temp_in_celcius {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        Scanner sc = new Scanner(System.in);
		
		float farenheit,celcius;
		
		
		System.out.println("enter temperature in celcius:");
		farenheit=sc.nextFloat();
		celcius=((farenheit-32)*5)/9;
		System.out.println("Temperature  in faherenheit is:"+celcius);
	}

}
