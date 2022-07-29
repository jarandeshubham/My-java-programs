package velocity;
import java.util.Scanner;
public class SimpleCalculator {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("enter your choice");
		System.out.println("1:addition  2:substraction 3:multiplication 4:division");
		int number=scanner.nextInt();
		System.out.println("enter the first number");
		int firstnum=scanner.nextInt();
		
		System.out.println("enter the second number");
		int secondnum=scanner.nextInt();
		
	switch (number)
		{
	case 1:
		System.out.println("the addition is: "+(firstnum+secondnum));
		break;
	case 2:
		System.out.println("the substraction is: "+(firstnum-secondnum));
		break;
		
	case 3:
		System.out.println("the multiplication is: "+(firstnum*secondnum));
		break;
	case 4:
		System.out.println("the division is: "+(firstnum/secondnum));
		break;
		
		default: System.out.println("enter valid choice");
		
			
		}
		

	}

}
