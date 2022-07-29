package velocity;

import java.util.Scanner;

public class PerfectSquareNumber {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("enter the number");
		int number=scanner.nextInt();
		
		int a=0;
		int count=0;
		for(int i=1;i<=number;i++)
		{
			if(number%i==0 && i*i==number)
			{
				count++;
				a=i;
			
			}
			
		}
		if(count>0)
		{
			System.out.println(number+" is perfect square number of: "+a);
		}
		else
		{
			System.out.println(number+" is not perfect square number");
		}
		


	}

}
