package oneDimensionalArray;

public class Duplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {1,1,1,2,3,4,5,8,5,6,3,5,6};
		int b[]=new int[a.length];
		int count=0;
		int ind=0;
		for(int i=0;i<a.length;i++)
		{
			count=0;
			for(int j=0;j<i;j++)
			{
				if(a[i]==a[j])
				{
					count++;
				}
			}
			if(count==0)
			{
				b[ind++]=a[i];
			}
		}
		for(int i=0;i<ind;i++)
		{
			System.out.print(b[i]+" ");
		}
	}

}
