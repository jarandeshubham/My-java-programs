package program;

import java.util.Scanner;

public class practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//System.out.println("hello\n"+"shubham");
		/*Scanner sc=new Scanner(System.in);
		
		System.out.println("enter first number:");
		int num1=sc.nextInt();
		
		System.out.println("enter second number:");
		int num2=sc.nextInt();
		
		int sum=num1+num2;
		System.out.println("The sum of two numbers is:"+sum);
	
		Scanner sc=new Scanner(System.in);
		int principle,time,rate;
		float interest;
		
		
		System.out.println("enteter princile amount: ");
		principle=sc.nextInt();
		
		System.out.println("enter time duration:");
		time=sc.nextInt();
		
		System.out.println("enter rate of interest");
		rate=sc.nextInt();
		
		 interest= principle*time*rate/100;
				System.out.println("simple interest is:"+interest);
	
		Scanner sc=new Scanner (System.in);
		
		
		System.out.println("enter first number:");
		int num1=sc.nextInt();
		
		System.out.println("enter second number:");
		int num2=sc.nextInt();
		
		int temp=0;
		temp=num1;
		num1=num2;
		num2=temp;
		System.out.println("after swapping first number num1 is:"+num1);
		System.out.println("after swapping secoond number num2 is:"+num2);
		
		Scanner sc=new Scanner(System.in);
	
		
		System.out.println("enter no of days:");
		int days=sc.nextInt();
		
	   int years=days/365;
	   System.out.println("years are"+years);
	   int remaindays=days%365;
	   int week=remaindays/7;
	   System.out.println("the weeks are:"+week);
	   remaindays=remaindays%7;
	   System.out.println("days are:"+remaindays);
		
		System.out.println("hef\n"+"shine");
		
		System.out.println("\"hefshine\"");
		
		System.out.println("hef\n"+"shine");
		
		int  k=2;
		
		System.out.println(k++ - ++k + k-- - k++ + ++k -k-- + --k + k+ k--- k + --k+ k++);
		
		
		Scanner sc=new Scanner (System.in);
		
		char ch;
		System.out.println("enter a character:");
		ch=sc.next().charAt(0);
		
		if(ch>='a' && ch<='z')
		{
			System.out.println(ch+ "this is an lower case");
			
		}
		else if(ch>='A' && ch<='Z')
		{
			System.out.println("");
		}
		
		Scanner sc=new Scanner(System.in);
		
		int year;
		
		System.out.println("enter year");
		year=sc.nextInt();
		
		if((year%2==0) && (year%100!=0))
		{
			System.out.println(year+" is leap year ");
		
		}
		
		else if(year%400==0)
		{
			System.out.println(year+" is leap year");
		}
		else
		{
			System.out.println("not leap year");
		}
		
		Scanner sc=new Scanner(System.in);
		
		int selling,cost;
		
		System.out.println("enter selling price");
		selling=sc.nextInt();
		
		System.out.println("enter cost price");
		cost=sc.nextInt();
		
		if((selling-cost)>0)
		{
			System.out.println("the profit of "+(selling-cost));
		}
		else if((cost-selling)<0)
		{
			System.out.println("the loss of"+(cost-selling));
		}
		
		Scanner sc=new Scanner(System.in);
		int number;
		System.out.println("enter a number");
		number=sc.nextInt();
		
		if (number>0)
		{
			System.out.println(number+" is positive");
		}
		else if (number<0)
		{
			System.out.println(number+" is negative");
		}
		else
		{
			System.out.println("invalid number");
		}
	
		int num, i, count=0;
	      Scanner s = new Scanner(System.in);
	      
	      System.out.print("Enter a Number: ");
	      num = s.nextInt();
	      
	      for(i=2; i<num; i++)
	      {
	         if(num%i == 0)
	         {
	            count++;
	            break;
	         }
	      }
	      
	      if(count==0)
	         System.out.println("\nIt is a Prime Number.");
	      else
	         System.out.println("\nIt is not a Prime Number.");
		
			*/
	    
	   
	        int a[][]={{1,3,4},{2,4,3},{3,4,5}};    
	        int b[][]={{1,3,4},{2,4,3},{1,2,4}};    
	            
	        //creating another matrix to store the sum of two matrices    
	        int c[][]=new int[3][3];  //3 rows and 3 columns  
	            
	        //adding and printing addition of 2 matrices    
	        for(int i=0;i<3;i++){    
	        for(int j=0;j<3;j++){    
	        c[i][j]=a[i][j]+b[i][j];    //use - for subtraction  
	        System.out.print(c[i][j]+" ");    
	        }    
	        System.out.println();//new line    
	        }    
	        } 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
				
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
