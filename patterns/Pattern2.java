package patterns;

public class Pattern2 
{

	public static void main(String[] args)
	{
		for(int i=0;i<6;i++)
		{
			for(int j=0;j<=i;j++)
			{
			   if(i%2==0)
			   {
				   System.out.print("0 ");
			   }
			   else
			   {
				   System.out.print("1 ");
			   }
			}
			System.out.println();
		}
	}
}
