package variables;


public class SimpleCalculator 
{


	 void add(int a, int b)
	{
	
		int c=a+b;
		System.out.println(c);
		
	}
	
	void sub(int a, int b)
	{
		int c=a-b;
	}
	
	public static void main(String [] args)
	{
		SimpleCalculator simpleCalculator=new SimpleCalculator();
		
		simpleCalculator.add(10,5);
	}
}
