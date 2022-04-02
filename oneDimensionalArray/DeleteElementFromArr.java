package oneDimensionalArray;

public class DeleteElementFromArr {

	public static void main(String[] args) {
		
		int[] a= {14,25,64,30,42,54,24};
		
		int delete=30;
		
		for(int i=0;i<a.length;i++)
		{
			if(delete==a[i])
			{
				for(int j=i;j<a.length-1;j++)
				{
					a[j]=a[j+1];
				}
				break; 
				
				
			}
			
		}
		for(int i=0;i<a.length-1;i++)
		{
			System.out.print(a[i]+" ");
		}

	}

}
