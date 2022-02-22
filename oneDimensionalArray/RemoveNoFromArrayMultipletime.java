package oneDimensionalArray;

import java.util.Scanner;

public class RemoveNoFromArrayMultipletime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {45,64,74,2,74,54,74,64,52};
		int number;
		int count=0;
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]+" ");
			System.out.println("enter a number");
			Scanner sc=new Scanner(System.in);
			number=sc.nextInt();
			
			if(number==a[i])
			{
				count++;
			}
		}
		int b[]=new int[a.length-count];
		for(int i=0;i<a.length;i++)
		{
			int index=0;
			if(number!=a[i])
			{
				b[index++]=a[i];
			}
			System.out.print(a[i]);
		}
		
	}

}
