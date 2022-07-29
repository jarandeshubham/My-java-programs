package velocity;

public class Print123 {

	public static void main(String[] args) {
		
		int count=0;
		
		for(int i=1;i<=3;i++)
		{
			count++;
			
			System.out.println(i);
			
			if(i==3)
			{
				i=0;
			}
			
			if(count==9)
			{
				break;
			}
		}

	}

}
