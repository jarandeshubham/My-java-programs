package nov23_class;

import java.util.Scanner;

public class Even_odd_number_While {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter num1");
		int num1=sc.nextInt();
		
		System.out.println("enter num2");
		int num2=sc.nextInt();
		
		int temp=num1;
		
		while(num1<=num2)
		{
			if(num1%2==0)
			{
				System.out.println("Even no "+num1);
			}
	
			num1++;
		}
		while(temp<=num2)
		{
			if(temp%2!=0)
			{
				System.out.println("odd no"+temp);
			}
			temp++;
		}
	}

}
