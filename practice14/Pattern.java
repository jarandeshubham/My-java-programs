package nov26_class;

public class Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int i=0; i<4; i++ )
		{
			for(int j=0; j<7; j++)
			{
				if((j-i>=0)&&(j+i<=6))
				{
				System.out.print("*");
				}
			
			else
			{
				System.out.print(" ");
			}
		}
         System.out.println();
	}
	}

}
