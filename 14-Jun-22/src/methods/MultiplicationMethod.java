package methods;

public class MultiplicationMethod {

	int mult(int a, int b)
	{
		return a*b;
	}
	
	public static void main(String[] args) {
		
		MultiplicationMethod multiplicationMethod=new MultiplicationMethod();
		
		System.out.println(multiplicationMethod.mult(4, 5));
	}
	
}
