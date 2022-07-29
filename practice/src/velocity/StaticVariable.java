package velocity;

import java.util.Scanner;

public class StaticVariable {
	
	int roll;
	String name;
	static String college="ITM";
	
	void setstudentinfo(int r, String n)
	{
	    this.roll=r;
	    this.name=n;
	}
	
	void getstudentinfo()
	{
		System.out.println("roll number:"+roll+"\nname:"+name+"\ncollege: "+college);
	}
	
	public static void main(String[] args) {
		StaticVariable staticVariable=new StaticVariable();
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter how many student data you want to add");
		int n=scanner.nextInt();
		
		for(int i=1;i<=n;i++ )
		{
			System.out.println();
			System.out.println("enter student roll number");
			int a=scanner.nextInt();
			System.out.println("enter student name");
			String b=scanner.next();
			staticVariable.setstudentinfo(a, b);
			staticVariable.getstudentinfo();
		}
		
		
				
	}

}
