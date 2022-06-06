package practice;

public class Array {

	public static void main(String[] args) {
		
		int[] a= {2,5,4,3,6,2,6,8,2,5};
		int pos=4;
		int ele=70;
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