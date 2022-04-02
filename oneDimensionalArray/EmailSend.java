package oneDimensionalArray;
import java.util.Arrays;
import java.util.*;  
import javax.mail.*;  
import javax.mail.internet.*;  
import javax.activation.*;  
   
public class EmailSend {

	public static void main(String[] args)
	{
		
	      String[] str = {"ghi@hotmail.com", "def@yahoo.com", "ghi@ngmail.com","abc@channelier.com", "abc@hotmail.com", "def@hotmail.com","abc@gmail.com","abc@yahoo.com", "def@channelier.com","jkl@hotmail.com","ghi@yahoo.com", "def@gmail.com"};
	      
	      Arrays.sort(str);
	      System.out.println(Arrays.toString(str));
	      
	      try {
	    	  Email email=new Email("gmailid","password");
	    	  email.setFrom("gmailid","company name");
	    	  email.setSubjct("this is a subject of email");
	    	  email.setContent("<h1> this is content of email<h1>","text/html");
	    	  email.addRecipient("a[0]");
	    	  
	    	  sendmail();
	    	  
	    	  
	      } catch (Exception e)
	      {
	    	  e.printStackTrace();
	      }

	}

}
