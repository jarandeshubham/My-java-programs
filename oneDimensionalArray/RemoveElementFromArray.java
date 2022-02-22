package oneDimensionalArray;

import java.util.Scanner;

public class RemoveElementFromArray {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int arr[]= {4,45,64,8,94,22};
		
		Scanner sc=new Scanner(System.in);
		
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i] +" ");
			
		}
		System.out.println();
		System.out.println("enter value which you want to delete");
		int number=sc.nextInt();
		for(int j=0;j<arr.length;j++)
		{
			if(number!=arr[j])
			{
				System.out.print(arr[j]+" ");
			}
		}
	}

}
