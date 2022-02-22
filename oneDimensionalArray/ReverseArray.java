package oneDimensionalArray;

public class ReverseArray {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int arr[]= {5,6,7,8,1,35,46,84,65};
		int i;
	
		System.out.println("simple array elament");
		for(i=0;i<arr.length;i++)
			
		{
			System.out.print(arr[i]+" ");	
		}
		
		System.out.println();
		System.out.println("reverse array element");

		for(i=arr.length-1;i>=0;i--)
		{
			System.out.print(arr[i]+" ");
		}

	}

}
