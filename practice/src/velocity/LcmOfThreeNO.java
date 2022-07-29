package velocity;

import java.util.Scanner;

public class LcmOfThreeNO {

	public static void main(String[] args) {


		Scanner scanner=new Scanner(System.in);
		System.out.println("enter first number");
		int firstnum=scanner.nextInt();
		
		System.out.println("enter second number");
		int secondnum=scanner.nextInt();
		
		System.out.println("enter third number");
		int thirdnum=scanner.nextInt();
		
		int count=1;
		for(int i=1;i<=count;i++)
		{
			count++;
			
			if(i%firstnum==0 && i%secondnum==0 && i%thirdnum==0)
			{
				System.out.println("LCM is= "+i);
				break;
			}
			
		}

	}

}
