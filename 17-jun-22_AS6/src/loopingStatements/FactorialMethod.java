package loopingStatements;

public class FactorialMethod {

	/*Design method int 
	factorial(int no)  which returns int value to that method. print the results 
	into main method (Example enter no as 5, factorial means 5*4*3*2*1 then output is 120)
	
	*/
	
	int Factorial(int no)
	{
		int fact=1;
		for(int i=no;i>0;i--)
		{
			fact=fact*i;
		}
		return fact;
	}
	
	public static void main(String[] args) 
	{
	
		FactorialMethod factorialMethod=new FactorialMethod();
		
		int result=factorialMethod.Factorial(5);

		System.out.println(result);
	}

}
