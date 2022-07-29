package velocity;

import java.util.Scanner;

public class Exception {

	public static void main(String[] args) {
		
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the number");
	int number=sc.nextInt();
	int cube=0;
	int sum=0;
	int temp=number;
	while(number!=0)
	{
		int rem=number%10;
		cube=rem*rem*rem;
		sum=sum+cube;
		number=number/10;
	}
	if(temp==sum)
	{
		System.out.println(temp+" is armstrong number");
	}
	else
	{
		System.out.println(temp+" is not armstrong");
	}
	}
}
