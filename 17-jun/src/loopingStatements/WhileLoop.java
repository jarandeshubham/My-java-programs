package loopingStatements;

public class WhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num=4254;
		int sum=0;
		
		while(num!=0)
		{
			int rem=num%10;  //rem=5; num=24 rem=4 rem=2
		        sum=sum+rem; //sum=0+5=5 sum=sum+rem 5+4 sum=9 9+2=11
		        num=num/10;  //num=24 num=2 
		}
		//jvm pointer
		
		System.out.println(sum);
		
	}

}

