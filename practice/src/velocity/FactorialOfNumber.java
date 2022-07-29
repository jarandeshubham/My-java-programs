package velocity;
import java.util.Scanner;
public class FactorialOfNumber {
	/*Design method to print factors of given number
	( Enter no = 6 then factors should be displayed like 1,2,3,6.
	*/
	
	void Fact(int num)
	{
		for(int i=1;i<=num;i++)
		{
			if(num%i==0)
			{
				System.out.print(i+",");
			}
		}
	}
		
	public static void main(String[] args) {

		FactorialOfNumber factorialofnumber=new FactorialOfNumber();
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the number");
		int number=scanner.nextInt();
		factorialofnumber.Fact(number);
		
		
		
	}

}
