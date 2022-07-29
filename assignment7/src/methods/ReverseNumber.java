package methods;

import java.util.Scanner;

public class ReverseNumber {

	/* Design method public int getReverseNumber(int num) which return int value to that method and result print into main method.
(Enter the no=125 then output will be 521
*/
	public int getReverseNumber(int num)
	{
		int rev=0;
		int rem;
		while(num>0)
		{
			 rem=num%10;
			rev=rev*10+rem;
			num=num/10;
		}
		
		return rev;
	}
	
	public static void main(String[] args) {
	
		ReverseNumber reversenumber=new ReverseNumber();
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the number");
		int number=scanner.nextInt();
		int result=reversenumber.getReverseNumber(number);
		System.out.println(result);

	}

}
