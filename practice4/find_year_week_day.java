package nov18_revision;

import java.util.Scanner;

public class find_year_week_day {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc= new Scanner(System.in);
		System.out.println("enter the no. of days:");
		int days=sc.nextInt();
		
		int years= days/365;
		System.out.println("no. of years is="+years);
		
		int remdays= days%365;
		int week=remdays/7;
		System.out.println("no. of days are="+week);
		 remdays=remdays%7;
		System.out.println("no. of weeks are="+week);


		
		
	}

}
