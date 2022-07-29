package velocity;

import java.util.Scanner;

public class ReverseNumber {

	/*Design method public int getReverseNumber(int num) which return int value
	to that method and result print into main method.
	(Enter the no=125 then output will be 521
		*/
	
	public int getReverseNumber(int num)
	{
		int rev=0;
		while(num!=0)
		{
			int rem=num%10;   // num=125%10=5   12%10=2 rem=1%10=1
			 rev=rev*10+rem;   //rev=0*10+5   rev=0+5=5  rev=5*10+2=52 rev=52*10+1=521
			 num=num/10;      //num=125/10  num=12/10=1 num=1/10=0
			
		}
		
		return rev;
		
	}
	
	public static void main(String[] args) 
	{
		ReverseNumber reversenumber=new ReverseNumber();
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the number for reverse");
		int number=scanner.nextInt();
		
		int result=reversenumber.getReverseNumber(number);
	  System.out.println("the reverse number is="+result);	
	}
}
