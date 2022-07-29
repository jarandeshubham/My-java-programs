package velocity;

public class Armstrong {

	public static void main(String[] args) {
	
		int number=65;
		int sum=0;
		int temp=number;
		while(number>0)   //407  40  4
		{
			int rem=number%10;   //rem=407%10=7   rem=40%10=0  rem=4%10=4
			
			int cube=rem*rem*rem;  //7*7*7=343   cube=0*0*0=0   cube=4*4*4=64
			
			 sum=sum+cube;     //0+343=343   sum=343+0=343  sum=343+64=407
			 
			 number=number/10;  //407/10=40  40/10=4   4/10=0
		}
		
		if(sum==temp)
		{
		    System.out.println(temp+" is armstrong number");
		}
		else
		{
			System.out.println(temp+" is not armstrong number");
		}
                        
	}

}
