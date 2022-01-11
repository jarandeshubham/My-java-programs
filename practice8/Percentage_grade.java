package nov20_revision;

import java.util.Scanner;

public class Percentage_grade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		
		int marathi, hindi, english, java, python;
		
		System.out.println("enter marks of marathi");
		marathi=sc.nextInt();
		
		System.out.println("enter marks of hindi");
		hindi=sc.nextInt();
		
		System.out.println("enter marks of english");
		english=sc.nextInt();
		
		System.out.println("enter marks of java");
		java=sc.nextInt();

		System.out.println("enter marks of python");
		python=sc.nextInt();
		
		int tot=marathi+hindi+english+java+python;
	     
	    int percentage= ((tot*100)/500);
	     
	    System.out.println("total marks are "+tot);
	    System.out.println("percentage are "+percentage);
	    
	    switch ((int)(percentage/10))
	    {
	    case 9: System.out.println("A grade");
	    break;
	    case 8: System.out.println("B grade");
	    break;
	    case 7: System.out.println("C grade");
	    break;
	    case 6:System.out.println("D grade");
	    break;
	    case 5:System.out.println("E grade");
	    break;
	    case 4:System.out.println("F grade");
	    break;
	    default :System.out.println("FAIL");
	    }
	    
	     
	     
	     
		
		}

}
