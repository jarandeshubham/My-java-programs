package atm_pro;

import java.util.Scanner;



public class Atm_pro {
	
	private  static int balance;
	Scanner scanner=new Scanner(System.in);
		
	   void cashDeposite(int amt)
	   {
		   
		    balance=balance+amt;
		   System.out.println("account credited by Rs."+amt);
		   
		   System.out.println("1.continue");
		   System.out.println("2.exit");
		   
		   int choice=scanner.nextInt();
		   switch(choice)
		   {
		   case 1:
			   savingAccount();
			   break;
		   case 2:System.out.println("thank you for using ATM!");
			   break;
			   
			   default:System.out.println("sorry enter valid choice");
			   
		   }
	   }
	   
	   void cashWithdraw(int amt)
	   {
		   
		   balance=balance-amt;
		   System.out.println("Account debited by Rs."+amt);
		   System.out.println("1.continue");
		   System.out.println("2.exit");
		   
		   int choice=scanner.nextInt();
		   switch(choice)
		   {
		   case 1:
			   savingAccount();
			   break;
		   case 2:System.out.println("thank you for using ATM!");
			   break;
			   
			   default:System.out.println("sorry enter valid choice");
			   
		   }
	   }
	
	    void savingAccount()
	    {
	    	System.out.println("1. Cash Deposite");
	    	System.out.println("2. Cash Withdraw");
	        System.out.println("3. balance Enquiry");
	    	
	    	
	    	int choice=scanner.nextInt();
	    	
	    	switch(choice)
	    	{
	    	case 1:
	    		System.out.println("enter amount you want to deposite");
	    		int amt=scanner.nextInt();
	    		cashDeposite(amt);
	    		break;
	    		
	    	case 2:
	    		System.out.println("enter amount you want to withdraw");
	    		int amount=scanner.nextInt();
	    		cashWithdraw(amount);
	    		break;
	    	case 3:
	    		balanceEnquiry();
	    		break;
	    		
	    		default:System.out.println("sorry enter valid choice");
	    	}
	    }
	    
	    void balanceEnquiry()
	    {
	    	System.out.println("Account balance is:"+balance);
	    	
	    	System.out.println("1.continue");
			   System.out.println("2.exit");
			   
			   int choice=scanner.nextInt();
			   switch(choice)
			   {
			   case 1:
				   savingAccount();
				   break;
			   case 2:System.out.println("thank you for using ATM!");
				   break;
				   
				   default:System.out.println(" sorry enter valid choice");
				   
			   }
	    }
	    
	    void getAccount()
	    {
	    System.out.println("select operation");
		
		System.out.println("1. for Saving Account");
		System.out.println("2. for Current Account");
		
		Scanner scanner=new Scanner(System.in);
		int choice=scanner.nextInt();
		
		switch(choice)
		{
		case 1:
			 savingAccount();
			 
			 break;
			 
		case 2:
			savingAccount();
			break;
			
			default:System.out.println(" sorry enter valid choice");
			
		}
	    }
	    
		void accountType()
		{
		
			System.out.println("welcome to ATM machine");
			
			System.out.println("1. proceed");
			System.out.println("2. exit");
			int choice=scanner.nextInt();
			
			switch(choice)
			{
			case 1:
				getAccount();
				break;
				
			case 2:System.out.println("thank you for using ATM!");
				break;
				
				default: System.out.println("sorry enter valid choice");
				
			}
			
			    
			
		}
		
		public static void main(String[] args) {
			
			Atm_pro atmPro=new Atm_pro(); 
			
			atmPro.accountType();
		}


}
