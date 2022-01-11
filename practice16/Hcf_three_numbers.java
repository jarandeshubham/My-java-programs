package program;

public class Hcf_three_numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//HCF of three numbers 
		System.out.println("enter first number");
		int num1=sc.nextInt();
		
		System.out.println("enter second number");
		int num2=sc.nextInt();
		
		System.out.println("enter third number");
		int num3=sc.nextInt();
		int number=2;
		
		for(int i=2;i<=number;i++)
		{
			number=number+1;
			
		       if(num2%num1==0 && num3%num1==0)
				{
					System.out.println("HCF is "+num1 );
					break;
				}
				else if(num1%num2==0 && num3%num2==0)
				{
					System.out.println("HCf is "+num2);
					break;
				}
				else if(num1%num3==0 && num2%num3==0)
				{
					System.out.println("HCF is "+num3);
					break;
				}
	
		if((num1%i==0) && (num2%i==0) &&(num3%i==0))		

			{	
               System.out.println("HCF is "+i);
			   break;
			}
			
		if((num1%i!=0) && (num2%i!=0) &&(num3%i!=0))
		{
			System.out.println("HCF is "+1);
			break;
		}
			}
		
	}

}
