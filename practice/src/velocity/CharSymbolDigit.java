package velocity;
import java.util.Scanner;
public class CharSymbolDigit {

	// Design method to check whether the character is alphabet, digit and special symbol.
	
	 void chartest(char ch)
	 {		 
			 if(ch>='0' && ch<='9')
			 {
				 System.out.println(ch+" is digit");
			 }
			 else if((ch>='a' && ch<='z')||(ch>='A' && ch<='Z'))
			 {
				 System.out.println(ch+" is alphabet");
			 }
			 
			 else
			 {
				 System.out.println(ch+" is special symbol");
			 }		 
	 }
	
	public static void main(String[] args) 
	{
		CharSymbolDigit charSymbolDigit=new CharSymbolDigit();
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the character");
		
		char character=scanner.next().charAt(0);
		
		charSymbolDigit.chartest(character);
		

	}

}
