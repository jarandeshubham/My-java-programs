package nov24_class;

import java.util.Scanner;

public class repetation_prime_even_odd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char choice;
		
		Scanner sc=new Scanner(System.in);
		do {
		System.out.println("enter choice you want from following  ");
		System.out.println("1.prime 2.even 3.odd");
		int n=sc.nextInt();
		
		switch(n)
		{
		case 1:System.out.println("enter a number");
		int num=sc.nextInt();
		boolean flag=true;
		for(int i=2; i<=num; i++)
		{
			if(num%i==0)
			{
				flag=false;
				break;
				
			}
		}
		if(!flag)
		{
			System.out.println(" is not prime no");
		}
		else
		{
			System.out.println(" prime no");
		}
		break;
		
		case 2: System.out.println("enter a number");
		        int num1=sc.nextInt();
		        
		        if(num1%2==0)
		        {
		        	System.out.println(num1+" is even number");
		        }
		        else
		        {
		        	System.out.println(num1+"  not even number");
		   
		        }
		        break;
		case 3: System.out.println("enter a number");
		        int num2=sc.nextInt();
		        
		        if(num2%2!=0)
		        {
		        	System.out.println(num2+" is odd number");
		        }
		        else
		        {
		        	System.out.println(num2+"  not odd number");

		        }
		        
		        break;
		     default:System.out.println("please enter number between 1 to 3");
		}
		System.out.println("do you wish to continue? press(yes/no)");
		choice=sc.next().charAt(0);
		}
		while(choice=='y');
	}

}
