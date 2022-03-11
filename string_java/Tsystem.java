  package string_java;

public class Tsystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  
		int num=20;
		
		int[] a=new int[num];
		int index=0;
		for (int i = 2; i <20; i++) 
		{
			if(num%i==0)
			{
				boolean flag =true;
				for (int j = 2; j < i; j++) 
				{
					if(i%j==0)
					{
						flag = false;
						
					}
					
				}
				if(flag==true)
				{
					a[index++]=i;
					
				}
			}
			}
		for (int i = 0; i < index; i++)
		{
			System.out.print(a[i]+" ");
			
		}
			int sum1=0;
			for (int k = 0; k <index; k++) 
			{
				int sum=0;
				for (int i = k+1; i < index; i++)
				{
					if(a[k]*a[i]==num)
					{
						sum=a[k]+a[i];
						break;
					}
				}
				if(sum!=0)
				{
					sum1=sum;
				}
				
			}
			System.out.println(sum1);
		
		
		
		
		
		
		
	}

}
