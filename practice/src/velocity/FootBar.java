package velocity;

public class FootBar {

	public static void main(String[] args) {
		
		for(int i=1;i<=100;i++)
		{
					
			 if(i%3==0 && i%4==0)
			{
				System.out.println("footbar");
			}
			 else if(i%3==0)
			{
				System.out.println("foot");
			}
			
			else if(i%4==0)
			{
				System.out.println("bar");
			}
			else
			{
				System.out.println(i);
			}
						
		}

	}

}
