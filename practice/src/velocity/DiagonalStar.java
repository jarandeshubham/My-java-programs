package velocity;

public class DiagonalStar {

	public static void main(String[] args) {

		for(int i=0;i<=4;i++)
		{
			for(int j=0;j<=i;j++)
			{
				if(i==j)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print("  ");
				}
				
			}
			System.out.println();
		}
	}

}
