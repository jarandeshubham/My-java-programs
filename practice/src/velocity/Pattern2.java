package velocity;
import java.util.Scanner;
public class Pattern2 {

	public static void main(String[] args) {
		
	Scanner scanner=new Scanner(System.in);
	System.out.println("enter days");
	int day=scanner.nextInt();
	
	int years=day/365; //820/365=2
	
	System.out.println("years= "+years);//2
	
	int remdays=day%365;  //remdays=820%365=90
	
	int weeks=remdays/7;   //weeks=90/7=12
	
	System.out.println("weeks="+weeks);  //12
	
	int days=remdays%7;  //days=90%7=6
	
	System.out.println("days="+days);
	
	
	
	}

}
