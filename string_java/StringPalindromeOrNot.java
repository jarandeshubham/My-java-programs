package string_java;

public class StringPalindromeOrNot {

	public static void main(String[] args)
	{
	 String s="kak";
	 
	String m="";
	 
	 for(int i=s.length()-1;i>=0;i--)		 
	 {
	     m=m+s.charAt(i);
	 }
	 
	 if(s.equals(m))
	 {
		 System.out.println("\""+s+"\""+" is palindrome ");
	 }
	 else
	 {
		 System.out.println("\""+s+"\""+ " is not palindrome");
	 }

	}

}
