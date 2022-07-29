package velocity;

import java.util.Scanner;

public class YearWeeksDays {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("enter days");
		int day=scanner.nextInt();
		
		int year=day/365;
		System.out.println("years: "+year);
		
		int remdays=day%365;
		
		int weeks=remdays/7;
		System.out.println("Weeks: "+weeks);
		
		int days=remdays%7;
		
		System.out.println("days: "+days);
				

	}

}
