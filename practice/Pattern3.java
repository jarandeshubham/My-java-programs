package practice;

public class Pattern3 {

	public static void main(String[] args) {
		
		int a=4;
		
		for(int i=1;i<=a*a;i++)
		{
			System.out.print(i+" ");
			if(i%a==0)
			{
				System.out.println();
			}
		}

	}

}
