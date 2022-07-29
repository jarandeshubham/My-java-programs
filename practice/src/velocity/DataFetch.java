package velocity;

import java.util.Scanner;

public class DataFetch {

	 String UserId="jarandesr";
	 
	 String password="Shubham@123";
	 
  	void getUserId(String id, String pass)
  	{
  		if(this.UserId==id && this.password==pass)
  		{
  			System.out.println("login successfully");
  		}
  		else
  		{
  			System.out.println("enter valid creditional");
  		}
  	}
	public static void main(String[] args) {
		
	    System.out.println("enter user id");
		Scanner scanner=new Scanner(System.in);
		
		String i=scanner.next();
		System.out.println("enter password");
		String p=scanner.next();
		
		DataFetch dataFetch=new DataFetch();
		
		dataFetch.getUserId(i,p);
				
	}
}
