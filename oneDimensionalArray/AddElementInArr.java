package oneDimensionalArray;

public class AddElementInArr {

	public static void main(String[] args) {
		
		int[] a= {14,25,64,30,42,54,24};
		int pos=4;
		int ele=68;
		for(int i=a.length-1;i>=4;i--)
		{
			a[i]=a[i-1];
			
		}
		a[pos]=ele;
		
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}

	}

}
