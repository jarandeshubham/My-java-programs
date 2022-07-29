package velocity;

import java.util.Scanner;

public class Sum {

	public static void main(String[] args) {
		System.out.println("enter the number");
		Scanner scanner=new Scanner(System.in);
		int sum=scanner.nextInt();
				
		for(int i=1;i<=sum;i++)
		{
			for(int j=i+1;j<=sum;j++)
			{
				for(int k=j+1;k<=sum;k++)
				{
					if(i+j+k==sum)
					{
						System.out.println(i+" "+j+" "+k);
					}
				}
				
			}
		}
	}
}
