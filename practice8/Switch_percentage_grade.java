package nov20_revision;

import java.util.Scanner;

public class Switch_percentage_grade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		
		int marathi,hindi,english,java,cpp;
		
		System.out.println("enter marks of marathi");
		marathi=sc.nextInt();
		
		System.out.println("enter marks of hindi");
		hindi=sc.nextInt();
		
		System.out.println("enter marks of english");
		english=sc.nextInt();
		
		System.out.println("enter marks of java");
		java=sc.nextInt();
		
		System.out.println("enter marks of cpp");
		cpp=sc.nextInt();
		
		int tot=marathi+english+hindi+java+cpp;
		
		int percentage=((tot*100)/500);
		System.out.println("obtain marks ="+tot);
		System.out.println("percentage= "+percentage);
		
		switch ((int)(percentage/10))
		{
		case 9:System.out.println("grade A");
		break;

		case 8:System.out.println("grade B");
		break;
		

		case 7:System.out.println("grade C");
		break;
		

		case 6:System.out.println("grade D");
		break;
		

		case 5:System.out.println("grade E");
		break;
		

		case 4:System.out.println("grade F");
		break;
		

	
		
		
		}
		
		
		
		
		
		
	}

}
