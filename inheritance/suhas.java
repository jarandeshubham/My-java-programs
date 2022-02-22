package inheritance;

import java.util.Scanner;

public class suhas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int number=sc.nextInt();
		int count=0;
		for(int i=2;i<=number;i++) 
		{
        	for(int j=2;j<=i;j++)
        		
		    	{
				for(int k=2;k<j;k++)
				{
					if(j%k==0)
					{
						count++;
						break;
					}
				}
				if(count==0)
	        	{
				System.out.println(j);
	        	}		
			}
        	
		}
			
	}

}

