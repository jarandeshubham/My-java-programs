package methods;
import java.util.Scanner;
public class TestChar 
{

	void getChar(char ch)
	{
		int a=(int)ch;
		System.out.println(a);
		if(a>=48 && a<=57)
		{
			System.out.println(ch+ " is digit");
		}
		
		else if(a>=65 && a<=122)
				{
			System.out.println(ch+ " is alphabet");
				}
		else
		{
			System.out.println(ch+" is special symbol");
		}
			
				
	}
	
	public static void main(String[] args) {
	
         TestChar testChar=new TestChar();
         
         System.out.println("enter any key");
         Scanner scanner=new Scanner(System.in);
         char c=scanner.next().charAt(0);
         
         testChar.getChar(c);
	}

}
