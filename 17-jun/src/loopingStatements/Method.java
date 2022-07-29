package loopingStatements;

public class Method {
	
	  static int sub(int a, int b)
	{
		int c=a-b;
		return c;
	}
	public static void main(String[] args)
	{
		
		int r=Method.sub(10, 5);
		
		System.out.println("substraction is: "+r);
	}

}
