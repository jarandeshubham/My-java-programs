package program;

public class Heighest_no {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1=7;
		int num2=9;
		int num3=5;
		if(num1>num2 && num1>num3)
		{
			System.out.println(num1);
			if(num2>num3)
			{
				System.out.println(num2);
			System.out.println("the multiplication is "+num1*num2);
			}
			else
			{
				System.out.println(num3);
				System.out.println("the multiplication is "+num1*num3);

			}
				
		}
		else if(num2>num1 && num2>num3)
		{
			System.out.println(num2);	
			if(num1>num3)
			{
				System.out.println(num1);
			System.out.println("the multiplication is "+num1*num2);
			}
			else
			{
				System.out.println(num3);
				System.out.println("the multiplication is "+num2*num3);
			
			}
				
		}
		else if(num3>num1 && num3>num2)
		{
			
			System.out.println(num3);
			if(num2>num1)
			{
				System.out.println(num2);
			System.out.println("the multiplication is "+num3*num2);
			}
			else
			{
				System.out.println(num1);
				System.out.println("the multiplication is "+num1*num3);
			
			}
				
		}
		
		
	}

}
