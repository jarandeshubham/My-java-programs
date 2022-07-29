package velocity;

public class PalindromeNumbers1to100 {

	public static void main(String[] args) {
	
		for(int i=1;i<=200;i++)
		{
			int j=i;
			int rev=0;
			while(j>0)
			{
				int rem=j%10;
				rev=rev*10+rem;
				j=j/10;
			}
			
			if(rev==i)
			{
				System.out.println(i);
			}
		}

	}

}
