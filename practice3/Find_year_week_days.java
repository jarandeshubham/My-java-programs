package nov18_class;

import java.util.Scanner;

public class Find_year_week_days {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Scanner sc=new Scanner(System.in);
   
   System.out.println("enter no. of days:");
   int noofdays=sc.nextInt();
   
   int year=noofdays/365;
     
   System.out.println(year+"years");
   
   int remainingdays=noofdays  %  365;
   int week=remainingdays/7;
   System.out.println(week+"weeks");
   remainingdays=remainingdays%7;
   System.out.println(remainingdays+"days");
		   
	
	
	
	}

}
