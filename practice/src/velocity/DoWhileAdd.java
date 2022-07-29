package velocity;

import java.util.Scanner;

public class DoWhileAdd {

	public static void main(String[] args) {
		
		
		Scanner scanner=new Scanner(System.in);
		char choice;
		
		do {
			
			System.out.println("enter the number");
			int number=scanner.nextInt();
			
			for(int i=1;i<=10;i++)
			{
				System.out.println(number*i);
			}
			
			System.out.println("do you want to continue");
			choice=scanner.next().charAt(0);
			
		}while(choice=='Y' || choice=='y');

		System.out.println("this is out");
	}
        
}
