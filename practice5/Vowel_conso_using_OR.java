package nov19_class;

import java.util.Scanner;

public class Vowel_conso_using_OR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a character :");
		char ch=sc.next().charAt(0);
		
		if ((ch=='a')||(ch=='e')||(ch=='i')||(ch=='o')||(ch=='u')||(ch=='A')||(ch=='E')||(ch=='I')||(ch=='O')||(ch=='U'))
		{
			System.out.println("the character is vowel");
		}
		else
		{
			System.out.println("the character is consonent");
		}
		
	}

}
