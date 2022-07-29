package velocity;

import java.util.Scanner;

public class Infosys {

	public static void main(String[] args) {
		
	    System.out.println("enter the number");
		Scanner sc=new Scanner(System.in);
		int number=sc.nextInt();
		
		int cal=1;
		int temp=0;
		for(int i=1;i<=number;i++)
		{
			 cal=cal*i;
			 if(cal%number==1)
			 {
				 temp=i;
				 
			 }
			
		}
		System.out.println(temp);

	}

}
