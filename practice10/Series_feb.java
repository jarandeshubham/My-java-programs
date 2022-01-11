package nov23_class;

import java.util.Scanner;

public class Series_feb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// 0 1 1 2 3 5 8 13 21 34 55
		Scanner sc=new Scanner (System.in);
		int firstnum,secondnumber,nextnum,count;
		
		System.out.println("enter number upto which you want seties to get dispay");
		int num=sc.nextInt();
		firstnum=0;
		secondnumber=1;
		count=0;
		while(count<num)
		{
			System.out.println(firstnum+"   ");
			nextnum=firstnum+secondnumber;
			firstnum=secondnumber;
			secondnumber=nextnum;
			count++;
			
		}
		
		
		
	}

}
