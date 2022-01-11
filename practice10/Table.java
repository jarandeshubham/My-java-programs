package nov23_class;

import java.util.Scanner;

public class Table {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		
		int i,num;
		System.out.println("enter the num to display the table");
		num=sc.nextInt();
		i=1;
		while(i<=10)
		{
			System.out.println(num+" * "+i+" = "+(i*num));
			i++;
		}
	}

}
