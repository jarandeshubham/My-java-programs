package velocity;

public class ArmstrongNumbers1To500 {

	public static void main(String[] args) {
		int sum;
	  for(int i=1;i<=500;i++)
	  {
		  sum=0;
		  int j=i;
		  while(j>0)
		  {
			  int rem=j%10;
			  int cube=rem*rem*rem;
			  sum=sum+cube;
			  j=j/10;
		  }
		  
		  if(sum==i)
		  {
			  System.out.println(i);
		  }
	  }

	}

}
