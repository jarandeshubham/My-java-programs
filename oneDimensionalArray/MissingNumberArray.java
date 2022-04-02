package oneDimensionalArray;

public class MissingNumberArray {

	public static void main(String[] args)
	{
	
             int[] a= {1,2,3,4,5,6,7,8,9,10,11,12,14,15,16,17,18,19,20};
		
		     int temp=0;
		
			 for(int j=0;j<a.length;j++)
			  {
				temp=temp+1;
				if(temp!=a[j])
				{
					System.out.println(temp);
					break;
				}
				
		        }
			

	}

}
