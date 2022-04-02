package oneDimensionalArray;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a= {1,2,4,5,7,9};
		int mid=0;
		int item=7;
		
		int min=0;
		int hig=a.length-1;
		mid=min+hig/2;
		
		while(mid>=0) {
		for(int i=0;i<a.length;i++)
		{
			if(mid==item)
			{
			   System.out.println("index position of item is "+i);	
			   break;
			}
			else if(item<mid)
			{
				mid=mid-1;
			}
			else
			{
				mid=mid+1;
			}
		}
		}
	}

}
