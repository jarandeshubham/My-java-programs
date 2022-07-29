package velocity1;
import java.util.Scanner;

import velocity.CubeOfNumber;
public class Test1 {

	public static void main(String[] args) {
		
		CubeOfNumber cubeofnumber=new CubeOfNumber();
		
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("enter the number");
		
		int number=scanner.nextInt();
		
		int result=cubeofnumber.getNumberCube(number);

		System.out.println("the cube is= "+result);
	}

}
