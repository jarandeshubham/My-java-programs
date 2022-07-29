package velocity;

public class Factorial {

	static int factorialOfNum(int num)
	{
		int fact=1;
		
		for(int i=num;i>0;i--)    
		{
			fact=fact*i;
		}
		
		return fact;
	}
	
	public static void main(String[] args) 
	{
		int result=Factorial.factorialOfNum(6);
		System.out.println(result);
	}
}
