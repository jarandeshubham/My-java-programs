package methods;

import java.util.Scanner;

public class NumberCube {
	
	public int getNumberCube(int num)
	{
		int cube=num*num*num;
		return cube;
	}

	public static void main(String[] args) {
		
		NumberCube numbercube=new NumberCube();
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter any number");
		int number=scanner.nextInt();
		
		int result=numbercube.getNumberCube(number);
		
		System.out.println("the cube is= "+result);
		
		
		

	}

}
