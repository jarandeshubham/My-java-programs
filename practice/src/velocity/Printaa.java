package velocity;
import java.util.Scanner;
public class Printaa 
{

	public static void main(String[] args) 
	{
		int count=0;
		for(int i=1;i<=3;i++) 
		 {
			System.out.println(i);
			count++;
		    if(i==3)
		    {
		    	i=1;
		    }
		     if(count==9)
		    {
		    	break;
		    }
		    
   		 }
 		
	}
}
