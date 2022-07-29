package velocity;

import java.util.Scanner;

public class FirstfivePrime {

	public static void main(String[] args) {
		
		System.out.println("enter the number");
		Scanner scanner=new Scanner(System.in);
		int number=scanner.nextInt();

		int temp=0;
        int count=2;
		for(int i=2;i<=count;i++)
		{
			int co=0;
			count++;
           for(int j=2;j<i;j++)
           {
        	   if(i%j==0)
        	   {
        		  co++;
        	   }
           }
           if(co==0)
           {
        	   System.out.println(i);
        	   temp++;
           }
           if(temp==number)
           {
        	   break;
           }
		}
		
		
	}
}
