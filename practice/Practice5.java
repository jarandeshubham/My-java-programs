package practice;
import java.util.Scanner;
public class Practice5 {

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		//System.out.println("enter a number");
		
	 int a[]= {1,1,1,2,3,4,5,8,5,6,3,5,6};

	 int count=0;
	 
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
			 System.out.println(a[i]);
		 }
	 }
	
	
		
	
		

	}

}
