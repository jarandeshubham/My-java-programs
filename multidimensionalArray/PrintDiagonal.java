package multidimensionalArray;

public class PrintDiagonal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int a[][]= {{2,5,6},{2,3,6},{6,7,4}};
		System.out.println("matrix array");
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				System.out.print(a[i][j]+" ");
				
			}	
			System.out.println();
		}
		System.out.println("the diagonal element from matrix");
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				
				if(i==j)
				{
					System.out.print(a[i][j]+" ");
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

