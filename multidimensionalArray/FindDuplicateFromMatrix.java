package multidimensionalArray;

public class FindDuplicateFromMatrix {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int arr[][]= {{2,4,6},{4,3,8},{5,6,4}};
		int i;
		int j;
		for(i=0;i<arr.length;i++)
		{
			for(j=0;j<arr.length;j++)
			{
			
				{
					System.out.print(arr[i][j]+" ");
				}
			}
			System.out.println();
			
		}
		System.out.println("duplicate element in given array:");
		
		for(i=0;i<arr.length;i++)
		{
			for(j=i+1;j<arr.length;j++)
			{
				if((arr[i][j]==arr[i][j])&& (arr[i]!=arr[j]))
				{
					System.out.println(arr[i][j]);
					
				}
			}
		}
	}

}
