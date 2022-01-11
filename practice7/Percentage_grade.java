package nov20_class;

import java.util.Scanner;

public class Percentage_grade {

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
		
		if(percentage>=90 && percentage<=100)
		{
			System.out.println("grade A");
		}
		
		else if(percentage>=80 && percentage<90)
		{
			System.out.println("grade B");
		}
		
		else if(percentage>=70 && percentage<80)
		{
			System.out.println("grade C");
		}
		
		else if(percentage>=60 && percentage<70)
		{
			System.out.println("grade D");
		}
		else if(percentage>=50 && percentage<60)
		{
			System.out.println("grade E");
		}
		else if(percentage>=40 && percentage<50)
		{
			System.out.println("grade F");
		}
		else
		{
			System.out.println("Fail");
		}
		
		
		
		
		
		
	}

}
