package com.array;

public class Arrayp {

	public static void main(String[] args) {
		
	
		int a[][]= {{2,4,5},{4,3,2},{1,4,7}};
		
		for(int i=0;i<a.length;i++)        
		{
			for(int j=0;j<a.length;j++)
			{
				System.out.print(a[i][j]+" ");
			}	
			System.out.println();
		}
		System.out.println("diagonal elements of matrix are:");
		for(int i=0;i<a.length;i++)        
		{
			for(int j=0;j<a.length;j++)
			{
				if(i==j)
				{
					System.out.print(a[i][j]+" ");
				}
				
			}	
			System.out.println();
		}
		
		int sum=0;
		for(int i=0;i<a.length;i++)        
		{
			for(int j=0;j<a.length;j++)
			{
				if(i==j)
				{
					sum=sum+a[i][j];
				}
			}	
			
		}
		System.out.println("addition of diagonal element is:");
		System.out.println(sum);
		
	}

}
