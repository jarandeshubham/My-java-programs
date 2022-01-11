package nov19_class;

import java.util.Scanner;

public class Consonant_vowel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		
		char ch;
		System.out.println("enter a character :");
		ch=sc.next().charAt(0);
		
		switch(ch)
		{
		case 'a': System.out.println("this is vowel");
		break;
		case 'e': System.out.println("this is vowel");
		break;
		case 'i': System.out.println("this is vowel");
		break;
		case 'o': System.out.println("this is vowel");
		break;
		case 'u': System.out.println("this is vowel");
		break;
		case 'A': System.out.println("this is vowel");
		break;
		case 'E': System.out.println("this is vowel");
		break;
		case 'I': System.out.println("this is vowel");
		break;
		case 'O': System.out.println("this is vowel");
		break;
		case 'U': System.out.println("this is vowel");
		break;
		default : System.out.println("this is consonent");
		}
	}

}
