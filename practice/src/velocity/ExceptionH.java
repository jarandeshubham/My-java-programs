package velocity;

public class ExceptionH  {

	public static void main(String[] args)  {
		
		
		System.out.println("hello");
		System.out.println("hello");
		System.out.println("hello");
		System.out.println("hello"); 
		try {
	
			int a=10/0;
			
		}catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		System.out.println("hello");
		System.out.println("hello");

	}

}
