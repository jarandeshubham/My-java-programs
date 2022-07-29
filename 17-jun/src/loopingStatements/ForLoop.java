package loopingStatements;

public class ForLoop 
{

	public static void main(String[] args)
	{
	
		int num=9;
		
		int count=0;
		
		for(int i=2;i<num;i++)
		{
			if(num%i==0)
			{
			count++;
			}	
		}
		// count=1
		if(count==0)
		{
			System.out.println(num+ " is prime number");
		}
		else
		{
			System.out.println(num+" is not prime number");
		}
	}
}
