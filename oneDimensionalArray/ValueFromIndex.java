package oneDimensionalArray;

import java.util.Scanner;

public class ValueFromIndex {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int a[]= {4,6,8,45,75,62,12,46};
		
		System.out.println("enter any index number for finding value");
		Scanner sc=new Scanner(System.in);
		int indnum=sc.nextInt();
		
		System.out.println(a[indnum]);
	}

}
