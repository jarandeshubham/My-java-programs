package velocity;

public class Asc {

	public static void main(String[] args) {
		
		for(int i=1;i<=100;i++)
		{
			int count=0;
			int j=i;
			while(j>0)
			{
				int rem=j%10;
				j=j/10;
			if(rem==7)
			{
			   count++;	
			}
			
			}
			
			if((i%7==0)&& count==0)
			{
			   System.out.println(i);
			}
		}

	}

}
