package velocity;

import java.util.Scanner;

public class FirstNNOddNumbers {

	public static void main(String[] args) {
		
		Scanner scanner =new Scanner(System.in);
		System.out.println("enter the number");
		int number=scanner.nextInt();
		

		int count=0;
		int i=1;
		int j=2;
		
		System.out.println("first "+number+" odd number");
		
		while(count!=number) 
		{
			if(i%j!=0)  
			{
				System.out.println(i);
				count++;
			}
			i++;
		}


	}

}
