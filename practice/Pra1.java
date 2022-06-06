package practice;
import java.util.Scanner;
public class Pra1 {

	public static void main(String[] args) {
		
	/*	Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int number=sc.nextInt();
		
		int count=0;
		int temp=number;
		int rem,rev=0;
		
		for(int i=0;i<number;i++)
		{
			rem=temp%10;
			rev=rev*10+rem;
			temp=temp/10;
			if(count==temp)
			{
				break;
			}
		}
		if(number==rev)
		{
			System.out.println(number+" is palindrome number");
			
		}
		else
		{
			System.out.println(number+" is not palindrome number");
		}*/
		
		/*int a[][]= {{2,5,4},{4,2,3},{2,3,4}};
		int b[][]= {{2,4,2},{4,2,3},{4,2,1}};
		
		int c[][]=new int[3][3];
		
		System.out.println("elements of first array");
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
		
		System.out.println("addition of two mattrix");
		
		for(int i=0;i<c.length;i++)
		{
			for(int j=0;j<c.length;j++)
			{
				c[i][j]=a[i][j]+b[i][j];
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}*/
		
		/*int a[][]= {{2,5,4},{4,2,3},{2,3,4}};
		
		System.out.println("elements of first array");
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		int sum=0;
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
		System.out.println("sum of diagonal elements \n "+sum);*/
		
	   /*String s="India is my country all Indians are my brother";
	   
	   for(int i=0;i<s.length();i++)
	   {
		   int count=0;
		   for(int j=0;j<i;j++)
		   {
			   if(s.charAt(i)==s.charAt(j))
			   {
				   if(((s.charAt(i)==' ')&& (s.charAt(j)==' ')))
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
		/*int a[]= {2,4,5,6,3,7,6,5,4};
		
		for(int i=0;i<a.length;i++)
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
		
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter a number");
		int number=sc.nextInt();
		int count=0;
		for(int i=2;i<number;i++)
		{
			if(number%i==0)
			{
				count++;
			}
		}
		if(count==0)
		{
			System.out.println(number+" is prime number");
		}
		else
		{
			System.out.println(number+" is not prime number");
		}

				
	}

}
