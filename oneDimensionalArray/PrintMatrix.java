package oneDimensionalArray;

public class PrintMatrix {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int arr[][]= {{2,4,6},{2,3,4},{3,2,4}};
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length;j++)
			{
				System.out.println(arr[i][j]);
			}
		}
	}

}
