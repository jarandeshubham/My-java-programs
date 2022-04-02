package oneDimensionalArray;

import java.util.Scanner;

public class LargestnDSmallest {

	public static void main(String[] args) 
	{
		int[] a= new int[4];
		int temp=0;
		int sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter array elements");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
				   temp=a[i];
				   a[i]=a[j];
				   a[j]=temp;
				}
					
			}
			
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();
		sum=a[0]+a[a.length-1];
		float avg=(float)sum/2;
		
		System.out.println("avg of largest& smallest el:\n"+avg);

	}

}
