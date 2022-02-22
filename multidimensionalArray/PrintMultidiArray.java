package multidimensionalArray;

public class PrintMultidiArray {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int arr[][]= {{15,25,15},{45,34,25},{12,31,45}};
		int i;
		int j;
		int count=0;
		System.out.println("the matrix is:");
		for(i=0;i<arr.length;i++)
		{
			for( j=0;j<arr.length;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			
			System.out.println();
		}
		
	}

}
