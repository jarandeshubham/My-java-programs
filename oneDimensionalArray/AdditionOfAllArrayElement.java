package oneDimensionalArray;

public class AdditionOfAllArrayElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {24,45,63,25,71,26,14};
		
		int sum=0;
		
		for(int i=0;i<a.length;i++)
		{
			sum=sum+a[i];
		}
		System.out.println("the addition of all array element is: "+sum);
		float avg=(float)sum/a.length;
		System.out.println("average is: "+avg);
	}

}
