package nov25_class;

import java.util.Scanner;

public class Khaprke_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		
		System.out.println("input a number of your choice");
		int num=sc.nextInt();
		
		
		int square=num*num;
		int squarecopy=square;
		int len=0;
		while(squarecopy!=0)
		{
			len++;
			squarecopy=squarecopy/10;
			System.out.println("length "+len);
			
		}
		int left=0, right=0;
		int j=0;
		for(int i=0; i<len; i++)
		{
			left=square/(int) Math.pow(10, i);
			right=(square%(int)Math.pow(10,i));
			if(left+right==num)
			{
				System.out.println(num+" kaprekar number");
				j++;
				break;
			}
		}
		if(j==0)
		{
			System.out.println(num+ " not a kaprekar number");
			}
		}
	}


