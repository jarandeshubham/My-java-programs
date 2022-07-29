package velocity;

public class Exception1  {

	public static void main(String[] args) {

		System.out.println("this is first line");
		System.out.println("this is second line");
		System.out.println("this is third line");
		try{
			int a=25/0;
			
		}catch(ArithmeticException e){
			System.out.println(e);
		}
		
		System.out.println("this is fourth line");
		
	}

}
