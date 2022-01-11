package nov24_class;

public class Pink_yellocolor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i,j,k;
		
		for(i=33; i<=99; i++)
		{
			if(i%3==0)
			{
				System.out.println(i+" pink");
			}
		}
		
		for(j=33; j<=99; j++)
		{
			if(j%5==0)
			{
				System.out.println(j+" yello");
			}
		}
		
		for(k=33; k<=99; k++)
		{
			if(k%3==0 && k%5==0)
			{
				System.out.println(k+" pink and yello");
			}
		}

	}

}
