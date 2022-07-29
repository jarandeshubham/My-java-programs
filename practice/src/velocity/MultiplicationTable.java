package velocity;

import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
		
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the number");
		int number=scanner.nextInt();
		
		if(number<=20 && number>=2)
		{
		      for(int i=1;i<=10;i++)
		          {
			          System.out.println(number*i);
		          }
		}
		
		      else
		{
			System.out.println("please enter number between 1 and 20");
		}

	}

}
