package multidimensionalArray;

public class SumTwoMatrix {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int a[][]= {{4,3,5},{2,3,4},{4,4,6}};
		int b[][]={{1,2,4},{2,5,4},{3,1,2}};
		int c[][]=new int[3][3];
		System.out.println("first matrix is: ");
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println("second matrix is: ");
		for(int i=0;i<b.length;i++)
		{
			for(int j=0;j<b.length;j++)
			{
				System.out.print(b[i][j]+" ");
			}
			System.out.println();
		}
		
		// addition of two matrix
		System.out.println("addition of two matrix");
		for(int i=0;i<c.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				 c[i][j]=a[i][j]+b[i][j];
				 System.out.print(c[i][j]+" ");
			}
			System.out.println();
		 }
	}
		
}


