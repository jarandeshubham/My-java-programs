package methods;

public class SubstractionMethod {

	int sub(int a, int b)
	{
		return a-b;
	}
	
	public static void main(String[] args) {
		
		SubstractionMethod substractionMethod=new SubstractionMethod();
		
		System.out.println(substractionMethod.sub(10, 5));
	}
}
