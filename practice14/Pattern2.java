package nov26_class;

public class Pattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// 11 is rows number and 7 is column no.
		for(int i=0; i<11; i++ )
		{
			for(int j=0; j<7; j++)
			{
				if((j+i<=5)||(j-i<=-5))
				{
				System.out.print(" * ");
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
