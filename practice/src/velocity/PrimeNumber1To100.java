package velocity;

public class PrimeNumber1To100 {

	public static void main(String[] args) {
		int counter=0;
		for(int i=2;i<=100;i++)
		{
			int count=0;
			for(int j=2;j<i;j++)
			{
				if(i%j==0)
				{
				   count++;	
				}
			}
			if(count==0)
			{
				System.out.println(i);
				counter++;
			}
		}
	
		System.out.println("total count is: "+counter);

	}

}
