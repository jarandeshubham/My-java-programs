package practice;
import java.util.Scanner;

public class ArithmeticArray 
{
	
	public static void main(String[] args) {

	 //int a[]={4,5,2,3,4,2,8,6};
	 
	 //System.out.println("length of array is:\n"+a.length);
	 //System.out.println("elements of array aree:");
	
	/* for(int i=0;i<a.length;i++)
	 {
		 int count=0;
		 for(int j=0;j<i;j++)
		 {
			 if(a[i]==a[j])
			 {
				 count++;
			 }
		 }
		 if(count==0)
		 {
			 System.out.print(a[i]+" ");
		 }
	 }*/
/*	 int temp=0;
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
	 System.out.println("smallest number from array");
	 System.out.println(a[0]);
	 System.out.println("largest number from array");
	 System.out.println(a[a.length-1]);
	 */
	 
		
		// String
		
	/*	String s="rabbit and tortoise private limited";
		char ch=' ';
		for(int i=0;i<s.length();i++)
		{
			int count=0;
			for(int j=0;j<i;j++)
			{
				if(s.charAt(i)==s.charAt(j))
				{
					if(s.charAt(i)==ch && s.charAt(j)==ch)
					{
						count=0;
					}
					else
					{
						count++;
					}
				}
			}
			
			if(count==0)
			{
				System.out.print(s.charAt(i));
			}
		}*/
		
		/*String s="dnyaneshwar khule patil";
		
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)!='n')
			{
				System.out.print(s.charAt(i));
			}
		}
		int count=0;
		System.out.println();
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)=='a')
			{
			   count++;
			}
		}
		System.out.println(count);*/
		
		int a [][]= {{1,2,5},{5,6,2},{2,4,1}};
		int b [][]= {{2,5,3},{2,1,3},{2,5,3}};
		int c[][]=new int[3][3];
		
		/*System.out.println("elements of first array");
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println("elements of second array");
		for(int i=0;i<b.length;i++)
		{
			for(int j=0;j<b.length;j++)
			{
				System.out.print(b[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println("addition of two array");
		
		for(int i=0;i<c.length;i++)
		{
			for(int j=0;j<c.length;j++)
			{
				c[i][j]=a[i][j]+b[i][j];
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}
		*/
		/*int sum=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				if(i==j)
				{
					sum=sum+a[i][j];
					System.out.println(a[i][j]);
				}
			}
		}
		System.out.println("sum of diagonal elements:");
		System.out.println(sum);*/
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		int sum=0;
		System.out.println("sum of all elements");
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				if(i!=j)
				{
					sum=sum+a[i][j];
				}				
			}
		}
		System.out.println(sum);
	
	}
}
