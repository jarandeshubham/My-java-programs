package multidimensionalArray;

public class AdditionOfDiagonal {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int a[][]= {{1,2,5},{4,6,2},{2,5,3}};
		int sum=0;
		
		System.out.println("matrix is:");
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}

		System.out.println("the addition of diagonal matrix");
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				if(i==j)
				{
					sum=sum+a[i][j];
				}
			}
		}
		System.out.println(sum);
	}

}
