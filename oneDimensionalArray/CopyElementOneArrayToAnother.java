package oneDimensionalArray;

public class CopyElementOneArrayToAnother {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int a[]= {67,54,62,15,5,63,14};
		int b[]=new int[a.length];
	int index=0;
		for(int i=0;i<a.length;i++)
		{
			int p=a[i];
			b[index]=p;
			index++;
		}
		for(int i=0;i<b.length;i++)
		{
			System.out.print(b[i]+" ");
		}
	}

}
