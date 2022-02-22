package oneDimensionalArray;

public class AssendingSort {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int arr[]= {4,6,45,8,7,98,65,54};
		int temp;
		System.out.println("before sort array element");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i] +" ");
		}
		System.out.println();
		System.out.println("after sort array element");
		for(int i=0;i<arr.length;i++)
		{
			
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
			
			System.out.print(arr[i]+" ");
		}
		
	}

}
