package oneDimensionalArray;

import java.util.Scanner;

//program for find index number

public class IndexFromValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,3,4,56,89,45,67,60,16};
		
		System.out.println("enter a value for index");
		Scanner sc=new Scanner(System.in);
		int number=sc.nextInt();
		
		for(int i=0;i<arr.length;i++)
		{
			if(number==arr[i])
			{
				System.out.println("index number is: "+i);
			}
		}
	}

}
