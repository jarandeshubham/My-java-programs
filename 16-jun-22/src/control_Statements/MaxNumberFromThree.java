package control_Statements;

public class MaxNumberFromThree {

	public static void main(String[] args) {
		
		int a=21;
		int b=45;
		int c=15;
		
		if(a>b && a>c)
		{
			System.out.println("a is greater");
		}
		else if(b>a && b>c)
		{
			System.out.println("b is greater");
		}
		else
		{
			System.out.println("c is greater");
		}

	}

}
