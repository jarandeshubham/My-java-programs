package methods;

public class AdditionMethod {

	int add(int a,int b)
	{
		int c=a+b;
		return c;
	}
	
	public static void main(String[] args) {
		
		AdditionMethod additionMethod=new AdditionMethod();
		
		int d=additionMethod.add(10,20);
		
		System.out.println(d);
	}
}
