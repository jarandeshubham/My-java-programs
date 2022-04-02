package string_java;

import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {
		
		String[] s= {"shubham","balaji","mahesh","jarande","jali"};
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your search");
		String s1="mahesh";
		
		int temp=0;
		for(int i=0;i<s.length;i++)
		{
			if(s[i]==s1)
			{
				System.out.println("item present in list "+ i+" nd position");
				temp=temp+1;
			}
		}
		if(temp==0)
			
		{
			System.out.println("item is not found in list");
			
		}

	}

}
