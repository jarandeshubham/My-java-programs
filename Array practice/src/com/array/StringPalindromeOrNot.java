package com.array;

public class StringPalindromeOrNot {

	public static void main(String[] args) {
		
		String s="nitin";
			
		int count=0;
		int temp=s.length()-1;
		for(int i=0;i<s.length();i++)  
		{
			   if(s.charAt(i)!=s.charAt(temp))  //true
                  {
			    	count++;
			    	break;
   			      }
			        temp--;
		}
         if(count==0)
         {
        	 System.out.println("palindrome");
         }
         else
         {
        	 System.out.println("not palindrome");
         }
	}

}
