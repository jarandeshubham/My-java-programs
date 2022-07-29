package velocity;

public class ForLoop {

	public static void main(String[] args) {
		
		int num=13;
		int rev=0;
	
	for(int i=1;i<=num;i++)
	{	
		if(num==0)
	   	{
	   		break;
	   	}
		
	   	int rem=num%10;  //12%10=2  1%10=1
	   	rev=rev*10+rem;   //2  21
	   	num=num/10;    // 12/10; 1/10=0.1
	   	
	   
	   	
	}
	System.out.println(rev);
	

	}

}
