package methods;

public class DivisionMethod {

	int div(int a, int b)
	{
		return a/b;
	}
	
	public static void main(String[] args) {
		
		DivisionMethod divisionMethod=new DivisionMethod();
		
		System.out.println(divisionMethod.div(20, 5));
	}
}
