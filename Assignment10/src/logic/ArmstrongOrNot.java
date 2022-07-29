package logic;

import java.util.Scanner;

public class ArmstrongOrNot {

	public static void main(String[] args) {

		Scanner scanner=new Scanner(System.in);
		
		System.out.println("enter the number");
		
		int number=scanner.nextInt();
		
		int temp=number;
		int sum=0;
		
		while(temp>0)
		{
			int rem=temp%10;
			int cube=rem*rem*rem;
			
			sum=sum+cube;
			
			temp=temp/10;
		}
		
      if(number==sum)
      {
    	  System.out.println(number+" is armstrong number");
      }
      else
      {
    	  System.out.println(number+" is not armstrong number");
      }

	}

}
