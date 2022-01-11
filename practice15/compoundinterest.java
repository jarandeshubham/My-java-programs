package pro11;

import java.util.Scanner;

public class compoundinterest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc= new Scanner(System.in);

      int principle;
      double rate;
      float time;
      int n;
      System.out.println("enter the principle amount");
      principle=1000;
      
      System.out.println("enter the rate of interest");
      rate=2;
      
      System.out.println("enter time in years");
      time=6;
      System.out.println("enter n:");
      n=6;
      double  d=1+(rate/(n));
      System.out.println("d "+d);
      double amount=(Math.pow(d,(n*time)));
      System.out.println("amount is:"+amount);
//      System.out.println(principle);
      double ci=amount-principle;
      System.out.print("the compound interest is the:"+ci);
      
      
      
	}

}
