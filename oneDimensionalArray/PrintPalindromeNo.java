package oneDimensionalArray;


public class PrintPalindromeNo {

	public static void main(String[] args) {


		
      int temp,rem;
      System.out.println("palindrome number between 10 to 100");
		for(int i=10;i<=100;i++)
		{
			temp=i;
			int rev=0;
			
			while(temp!=0)
			{
		    	rem=temp%10;
		    	rev=rev*10+rem;
		    	temp=temp/10;
			}
	     	if(i==rev)
	    	{
	    		System.out.println(i);
	    	}
	    
			
		}
			
	           	
		}
		
	

}
