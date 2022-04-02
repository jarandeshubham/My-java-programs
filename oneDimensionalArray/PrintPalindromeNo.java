package oneDimensionalArray;
import java.util.ArrayList;

public class PrintPalindromeNo {

	public static void main(String[] args) {


		
      int temp,rev=0,rem;
		for(int i=1;i<=100;i++)
		{
		    	temp=i;
		    	rem=temp%10;
		    	rev=rev*10+rem;
		    	temp=temp/7;
		    	
		    	
		}
		if(i==rev)
    	{
    		System.out.println(i+" is palindrome number");
    	}
    	else
    	{
    		System.out.println(i+" is not palindrome number");
    	}
	     
	}

}
