package velocity;
import java.util.Scanner;
/*Design method public int getNumberCube(int num),
  return int value to that method and result should be into main method.
 */

public class CubeOfNumber {

	public int getNumberCube(int num)
	{
		int cube=num*num*num;
		
		return cube;
	}
	
	public static void main(String[] args) 
	{
		CubeOfNumber cubeofnumber=new CubeOfNumber();
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the number");
		int number=scanner.nextInt();
		
		System.out.println(cubeofnumber.getNumberCube(number));
	}
	
}
