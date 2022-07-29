package velocity;

import java.util.Scanner;

public class Table_Iteration {

	public static void main(String[] args) {
		char ch;
		Scanner scanner=new Scanner(System.in);
		do {
		System.out.println("enter the number");
		
		int number=scanner.nextInt();
		
		for(int i=1;i<=10;i++)
		{
			System.out.println(i*number);
		}
		
		System.out.println("do you want to continue");
		ch=scanner.next().charAt(0);
		}while(ch=='Y' || ch=='y');
	}

}
