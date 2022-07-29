package velocity;

public class Test {

	public static void main(String[] args) 
	{
		
		Sbi sbi=new Sbi();
		Icici icici=new Icici();
		Hdfc hdfc=new Hdfc();
		System.out.println("SBI rate of interest"+sbi.getRateOfInterest());
		
		System.out.println("ICICI rate of interest"+icici.getRateOfInterest());
		System.out.println("HDFC rate of interest"+hdfc.getRateOfInterest());
	}
	
}
     class Bank
     {
    	 int getRateOfInterest()
    	 {
    	 	return 0;
    	 }
	
     }

	class Sbi extends Test
	{
		
		int getRateOfInterest()
		{
			return 7;
		}
	}
	
	class Icici extends Test
	{
		
		int getRateOfInterest()
		{
			return 8;
			
		}
	}
	
	class Hdfc extends Test
	{
		int getRateOfInterest()
		{
			return 9;
		}
	}
	
	
	


