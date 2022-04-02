package oneDimensionalArray;

import java.util.Scanner;

public class ArrayElementsAverage {

	public static void main(String[] args) 
	{
		

		int[] a;
	 	a=new int[5];
	     int count=0;
	     int sum=0;
         int avg;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter array elements");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();						
		}
		
		for(int i=0;i<a.length;i++)
		{
		    count++;
			sum=sum+a[i];
		
		}
		avg=sum/count;
	
		if(avg==count)
		{
		        System.out.println("elements are: "+count);
				System.out.println("sum of array elements: "+sum);
				System.out.println("average of array elements: "+avg);
				
		    	System.out.println("The elements and average are same");
			    System.out.println(count);
		}
	}

}
