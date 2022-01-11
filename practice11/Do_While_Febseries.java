package nov23_revision;

import java.util.Scanner;

public class Do_While_Febseries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//0 1 1 2 3  5 8 13 .....
		Scanner sc=new Scanner(System.in);
		
		int firstnum,secondnum,nextnum;
		
		System.out.println("enter the number you want display series");
		int num=sc.nextInt();
		
		firstnum=0;
		secondnum=1;
		
		int count=0;
		
		do
		{
			System.out.println(firstnum);
			
		 nextnum=firstnum+secondnum;
		 firstnum=secondnum;
		 secondnum=nextnum;
			count++;
		}
		while(count<num);
		
	}

}
