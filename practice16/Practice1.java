package program;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class Practice1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner (System.in);
		/*
		System.out.println("enter two numbers");
	    int number1=sc.nextInt();
	    int number2=sc.nextInt();
	    
	    int add=number1+number2;
	    System.out.println("the addition is "+add);
	    if(number1%2==0)
	    {
	    	System.out.println(number1+" is even number");
	    }
	    
	   else if(number1%2!=0)
	    {
	    	System.out.println(number1+" is odd number");
	    }
	 
	    
	    int year=days/365;
	    
	    int remdays=days%365;
	    int weeks=remdays/7;
	    int remaining=remdays%7;
	    if(year>1)
	    {
	    	System.out.println(year+" years");
	    }
	    else
	    {
	    	System.out.println(year+" year");	
	    }
	    if(weeks>1)
	    {
		    System.out.println(weeks+" weeks");

	    }
	    else
	    {
	    System.out.println(weeks+" week");
	    }
	    
	    if(days>1)
	    {
	    System.out.println(remaining+" days");
	    }
	    else
	    {
		    System.out.println(remaining+" day");

	    }
	    
	      
	    System.out.println("before swapping two numbers");
	    System.out.println(number1+"  "+number2);
	   
	   
	  number1=number1+number2;
	  number2=number1-number2;
	  number1=number1-number2;
	   
	   System.out.println("after swapping two numbers");
	   System.out.println(number1+"  "+number2);
	  
	    
		System.out.println("enter cost price");
		int cost=sc.nextInt();
		
		System.out.println("enter selling price");
		int selling=sc.nextInt();
		
		if(selling>cost)
		{
			System.out.println("the profit of "+(selling-cost));
		}
		else if(cost>selling)
		{
			System.out.println("the loss of "+(cost-selling));
			
		}
		else
		{
			System.out.println("breakeven");
		}
		
		System.out.println("enter year");
		int year=sc.nextInt();
		
		if(year%4==0 && year%100!=0)
		{
			System.out.println(year+" is leap year");
			
		}
		else if(year%400==0)
		{
			System.out.println(year+" is leap year");
		}
		else
		{
			System.out.println("not a leap year");
		}
		System.out.println("enter  a number for operation");
		System.out.println("choose 1.addition 2.multiplication 3.division 4.substraction");

		int number=sc.nextInt();
		
		System.out.println("enter first number");
		int num1=sc.nextInt();
		
		System.out.println("enter second number");
		int num2=sc.nextInt();
		
		switch(number)
		{

		case 1:System.out.println("the addition is "+(num1+num2));
		break;

		case 2:System.out.println("the multiplication is "+(num1*num2));
		break;

		case 3:System.out.println("the division is "+(num1/num2));
		break;

		case 4:System.out.println("the substraction is "+(num1-num2));
		break;

		
		default :System.out.println(" enter correct choice");
		}
		
		for(int i=0;i<7;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print(" ");
			}
			System.out.println("*");
		}
		for(int i=0;i<6;i++)
		{
			for(int j=0;j<=6;j++)
			{
				System.out.print("*");
			}
			System.out.println("");
		}
		
		
		
		System.out.println("enter a number to ");

		int number=sc.nextInt();
		
		for(int i=1;i<=10;i++)
		{
			System.out.println(number+"*"+i+"="+(number*i));
		}

		System.out.println("enter a number ");
		int number=sc.nextInt();
		int rem,sum=0;
		
		while(number>0)
		{
		    rem=number%10;
		    sum=sum+rem;
		    number=number/10;
		}
		 System.out.println("the sum of digit is "+sum);
		
		
		//feb series 0 1 1 2 3 5 8 13 21 
		System.out.println("enter a number you want to print feb");
		int number=sc.nextInt();
		
		int firstnum,nextnum,secondnum,count;
		
		firstnum=0;
		secondnum=1;
		count=0;
		
		while(number>count)
		{
			System.out.println(firstnum);
			
			nextnum=firstnum+secondnum;
			firstnum=secondnum;
			secondnum=nextnum;
			
			 count++;
			
		}
		
		System.out.println("the max number is= "+(()));
		
		System.out.println("Enter a number");
		int number=sc.nextInt();
		int sum=0;
		while(number>0)
		{
			int rem=number%10;
			    sum=sum+rem;
			    number=number/10;
		}
		System.out.println("the addition of digit is="+sum);
	

		System.out.println("enter a number for f series");
		int number=sc.nextInt();
		
		int firstnum=0,secondnum=1,count=0,nextnum;
		while(number>count)
		{
			System.out.println(" "+firstnum);
			nextnum=firstnum+secondnum;
			firstnum=secondnum;
			secondnum=nextnum;
			count++;
		}
		
		System.out.println("enter a year ");
		int year=sc.nextInt();
		
		if(year%4==0 && year%100!=0)
		{
			System.out.println(year+" this is leap year");
			
		}
		else if(year%400==0)
		{
			System.out.println(year+" this is leap year");
		}
		else 
		{
			System.out.println(year+"  not a leap year");
		}
		
		
	
		System.out.println("enter a number");
		int number=sc.nextInt();
		
		int fact=1;
		while(number>0)
		{
			fact=number*fact;
			number--;
		}
		
		System.out.println("the factorial is ="+fact);
		
		System.out.println("enter a number");
		int number=sc.nextInt();
		int fact=1;
		for(int i=1;i<=number;i++)
		{
			fact=fact*i;

		}
		System.out.println("the factorial is="+fact);
	
		System.out.println("enter first number");
		int a=sc.nextInt();
		System.out.println("enter second number");
		int b=sc.nextInt();
		System.out.println("enter third numbe");
		int c=sc.nextInt();
		
		if(a>b && a>c)
		{
			System.out.println("maximum number is "+a);
			
		}
		else if(b>a && b>c)
		{
			System.out.println("maximum number is "+b);
		}
		else
		{
			System.out.println("maximum number is "+c);
		}
	
		System.out.println("enter a number");
		int number=sc.nextInt();
		
		if(number%2==0)
		{
			System.out.println("the number "+number+" is even number");
		}
		else
		{
			System.out.println("the number "+number+(" is odd number"));
		}
	
		System.out.println("enter a number");
		int number=sc.nextInt();
		
		if(number>0)
		{
			System.out.println("the given number is positive");
		}
		else if(number<0)
		{
			System.out.println("the given number is negative ");
			
		}
		else
		{
			System.out.println("the given number is zero");
		}
		
		System.out.println("enter first number");
		int num1=sc.nextInt();
		System.out.println("enter second number");
		int num2=sc.nextInt();
		
		if(num1>num2)
		{
			System.out.println("the maximum number is "+num1);
		}
		else 
		{
			System.out.println("the maximum number is "+num2);
		}
		
		
		System.out.println("enter a character");
		char ch=sc.next().charAt(0);
		
		switch(ch)
		{
		case 'a' :System.out.println("entered character is vowel");
		break;

		case 'e' :System.out.println("entered character is vowel");
		break;

		case 'i' :System.out.println("entered character is vowel");
		break;

		case 'o' :System.out.println("entered character is vowel");
		break;

		case 'u' :System.out.println("entered character is vowel");
		break;

		case 'A' :System.out.println("entered character is vowel");
		break;

		case 'E' :System.out.println("entered character is vowel");
		break;

		case 'I' :System.out.println("entered character is vowel");
		break;

		case 'O' :System.out.println("entered character is vowel");
		break;

		case 'U' :System.out.println("entered character is vowel");
		break;
		default: System.out.println("entered character is consonant");
		}
	
		System.out.println("enter the character ");
		char ch=sc.next().charAt(0);
		
	if(ch>='a' && ch<='z')
	{
		System.out.println("entered character is lowercase");
	}
	else if(ch>='A' && ch<='Z')
	{
		System.out.println("entered character is uppercase");
	}
	else
	{
		System.out.println("enter valid character");
	}
	
		System.out.println("enter a character ");
		char ch=sc.next().charAt(0);
		
		int number=ch;
		if(number>=65 && number<=91)
		{
			System.out.println("entered character is Uppercase");
		}
		else if(number>=97 && number<=122)
		{
			System.out.println("entered character is lowercase");
		}
		else
		{
			System.out.println("enter valid character");
		}
		
	    int i=1;  
	    //do-while loop  
	    do{  
	        if(i==5){  
	                //using continue statement  
	                 i++;  
	            continue;//it will skip the rest statement  
	        }  
	        System.out.println(i);  
	        i++;  
	    }while(i<=10);
	      
	 int a[][]={{1,3,4},{2,4,3},{3,4,5}};    
    int b[][]={{1,3,4},{2,4,3},{1,2,4}};    
        
       
    int c[][]=new int[3][3];  
        
    
    for(int i=0;i<3;i++){    
    for(int j=0;j<3;j++){    
    c[i][j]=a[i][j]+b[i][j];   
    System.out.print(c[i][j]+" ");    
    }    
    System.out.println();
    }   
    
		System.out.println("\"shu"+"bham\"");
	
		System.out.println("enter the cost price");
		int cost=sc.nextInt();
		System.out.println("enter selling price");
		int selling=sc.nextInt();
		
		if(selling>cost)
		{
			System.out.println("the profit of "+(selling-cost));
		} 
		else if(selling<cost)
		{
			System.out.println("the loss of "+(cost-selling));
		}
		else
		{
			System.out.println("breakeven");
		}
		
		System.out.println("enter first number");
		int num1=sc.nextInt();
		System.out.println("enter second number");
		int num2=sc.nextInt();
		
		System.out.println("enter a choice of operation");
		System.out.println("1.addition 2.sub 3.multiplication 4.division");
		int number=sc.nextInt();
		
		switch(number)
		{
		case 1:System.out.println("the addition is "+(num1+num2));
		break;

		case 2:System.out.println("the substraction is "+(num1-num2));
		break;
		
		case 3:System.out.println("the multiplication is "+(num1*num2));
		break;

		case 4:System.out.println("the division is "+(num1/num2));
		break;
		default:System.out.println("enter valid number ");
		
		}
	
		System.out.println("enter a character");
		char ch=sc.next().charAt(0);
		int number=ch;
		if((ch>='a' && ch<='z') || (ch>='A' && ch<='Z'))
		{
			System.out.println("entered character is alphabet");
		}
		else if(number>=47 && number<=57)
		{
			System.out.println("entered character is digit");
		}
		else
		{
			System.out.println("entered character is special symbol");
		}
	
		System.out.println("enter a year");
		int year=sc.nextInt();
		
		if(year%4==0 && year%100!=0)
		{
			System.out.println(year+" is leap year");
		}
		else if(year%400==0)
		{
			System.out.println(year+" is leap hear");
		}
		else
		{
			System.out.println(year+" not a leap year");
		}
	
		int mar,eng,math,hindi,java;
		
		System.out.println("enter marathi marks");
		mar=sc.nextInt();

		System.out.println("enter eng marks");
		eng=sc.nextInt();
		
		System.out.println("enter math marks");
		math=sc.nextInt();
		
		System.out.println("enter hindi marks");
		hindi=sc.nextInt();
		
		System.out.println("enter java marks");
		java=sc.nextInt();
		
		int total=mar+eng+math+hindi+java;
		int percentage=total*100/500;
		
		System.out.println("total marks obtained= "+total);
		System.out.println("percentage= "+percentage+"%");
		
		if(percentage>=90)
		{
			System.out.println(" grade=  A");
		}
		else if(percentage>=80)
		{
			System.out.println(" grade=  B");
		}
		else if(percentage>=70)
		{
			System.out.println(" grade=  C");
		}
		else if(percentage>=60)
		{
			System.out.println(" grade=  D");
		}
		else if(percentage>=50)
		{
			System.out.println(" grade=  E");
			
		}
		else if(percentage>=40)
		{
			System.out.println(" grade=  F");
		}
		else
		{
			System.out.println("fail");
		}
	
		for(int i=1;i<=5;i++)
		{
			for(int j=5;j>=i;j++)
			{
				System.out.print(" *");
			}
			System.out.println();
		}
	
		for(int i=1;i<=5;i++)
		{
			for(int j=5;j>=i;j--)
			{
				System.out.print(" *");
			}
			System.out.println();
		}
		
		
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(" *");
			}
			System.out.println();
		}
	 for(int i=1;i<=5;i++)
	 {
		 for(int j=4; j>=i;j--)
		 {
			 System.out.print(" *");
		 }
		 System.out.println();
	 }
	
		for(int i=1;i<=5;i++)
		{
			for(int j=5;j>=i;j--)
			{
				System.out.print(" *");
			}
			System.out.println();
		}
		for(int i=2;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(" *");
			}
			System.out.println();
		}
	
		for(int i=1;i<=5;i++)
		{
			for(int j=5;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=1;i<=5;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print(" ");
			}
			for(int k=4;k>=i;k--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	
		for(int i=1;i<=5;i++)
		{
			for(int j=5;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print("*");
			}
			System.out.println();
			}
		for(int i=1;i<=5;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print(" ");
			}
			for(int k=4;k>=i;k--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	
		for(int i=1;i<=5;i++)
		{
			for(int j=5;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=1;i<=5;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print(" ");
			}
			for(int k=4;k>=i;k--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i=1; i<=5;i++)
		{
			for(int j=4;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(" ");
			}
			for(int k=4;k>=i;k--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i=1;i<=5;i++)
		{
			for(int j=5;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print(" *");
			}
			System.out.println();
		}
		
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(" ");
			}
			for(int k=5;k>=i;k--)
			{
				System.out.print(" *");
			}
			System.out.println();
		}
		
		for(int i=1;i<=5;i++)
		{
			for(int j=5;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print("*");
			}
			for(int a=2;a<=i;a++)
			{
				
					System.out.print("*");
			}
			
			System.out.println();
		}
		
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(" ");
			}
			for(int k=5;k>=i;k--)
			{
				System.out.print("*");
			}
			for(int l=4;l>=i;l--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(" ");
			}
			for(int k=5;k>=i;k--)
			{
				
              System.out.print("*");				
			}
			System.out.println();
		}
		for(int i=1;i<=5;i++)
		{
			for(int j=5;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		//lcm of three numbers
		System.out.println("enter row number");
		int num1=sc.nextInt();
		
		System.out.println("enter column number");
		int num2=sc.nextInt();
		

		System.out.println("enter element number");
		int num3=sc.nextInt();
		
		int number=1;
		for(int i=1;i<=number;i++)
		{
			  number=number+1;

			if((i%num1==0) && (i%num2==0) && (i%num3==0))
			{
			
				System.out.println("the lcm is "+i);
                break;

			}

		}


		//HCF of three numbers 
		System.out.println("enter first number");
		int num1=sc.nextInt();
		
		System.out.println("enter second number");
		int num2=sc.nextInt();
		
		System.out.println("enter third number");
		int num3=sc.nextInt();
		int number=2;
		
		for(int i=2;i<=number;i++)
		{
			number=number+1;
			
		       if(num2%num1==0 && num3%num1==0)
				{
					System.out.println("HCF is "+num1 );
					break;
				}
				else if(num1%num2==0 && num3%num2==0)
				{
					System.out.println("HCf is "+num2);
					break;
				}
				else if(num1%num3==0 && num2%num3==0)
				{
					System.out.println("HCF is "+num3);
					break;
				}
	
		if((num1%i==0) && (num2%i==0) &&(num3%i==0))		

			{	
               System.out.println("HCF is "+i);
			   break;
			}
			
		if((num1%i!=0) && (num2%i!=0) &&(num3%i!=0))
		{
			System.out.println("HCF is "+1);
			break;
		}
	 }

		
		char ch='A';
		for(int i=1;i<=5;i++)
		{
		
					System.out.println(ch+" ");
			for(int j=1;j<=i;j++)
			{
				System.out.print(ch+" ");
				
			}
			System.out.println();
			ch++;
		}
  
		// number is prime or not
		System.out.println("enter a number");
		int number=sc.nextInt();
		int temp=0;
		for(int i=2;i<number;i++)
		{
			if(number%i==0)
			{
			 temp=temp+1;
			}
			
		}
		if(temp==1)
		{
			System.out.println(number+" is not prime number");
		}
		else
		{
			System.out.println(number+" is prime number");
		}
				
			
		System.out.println("enter a number");
		int number=sc.nextInt();
		int firstnum=0,secondnum=1;
		int nextnum=0;
		
		for(int i=0;i<=number;i++)
		{
			System.out.println(firstnum+" ");
			nextnum=firstnum+secondnum;
			firstnum=secondnum;
			secondnum=nextnum;
			
		}
		

	System.out.println("enter number");
	int number=sc.nextInt();
	int rev=0;
	while(number>0)
	{
		int rem=number%10;
		rev=rev*10+rem;
		
		number=number/10;
		
	}
	System.out.print("the reverse is "+rev);


//reverse number by using for loop
		System.out.println("enter a number");
		int number=sc.nextInt();
		
		int rev=0;
		
		for(int i=1;i<=number;i++)
		{
			int rem=number%10;
			rev=rev*10+rem;
			number=number/10;
		}
		System.out.println("the reverse is "+rev);

		
		System.out.println("enter number");
		int number=sc.nextInt();
		int rev=0;
		int rem;
		int temp=0;
		while(number>0)
		{
			
			 rem=number%10;
			if(rem==0)
			{
			System.out.print(0);
			
			}
			rev=rev*10+rem;
			
			number=number/10;
			
		}
		
		
		System.out.print(rev+" is reverse ");

		//reverse the string
		System.out.println("enter a string name");
		String str=sc.next();
		
		int count=str.length();
		String rev="";
		for(int i=count-1;i>=0;i--)
		{
			 rev=rev+str.charAt(i);
		
		}
		System.out.println("the reverse string is=\" "+rev+" \"");

		System.out.println("enter a string");
		String str=sc.next();
		int count=str.length();
		
		String rev="";
		
		for(int i=count-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
		}
		
		System.out.println(rev);
		
		

		System.out.println("enter number");
		int number=sc.nextInt();
		int rev=0;
		int rem;
		int temp=0;
		
		while(number!=0)
		{
			
			 rem=number%10;
			
			rev=rev*10+rem;
			
			number=number/10;
			
		}
		
		
		System.out.print(rev+" is reverse ");


		//prime number between 1 to 100
		int temp=0;
		System.out.println("prime numbers between 1 to 100");
		for(int i=2;i<=100;i++)
		{
			for(int j=2;j<=i-1;j++)
			{
				if(i%j==0)
				{
				temp=temp+1;
				}
				
			}
			if(temp==0)
			{
				System.out.println(i);
			}
			else
			{
				temp=0;
			}
			
		}
		
		//the prime numbers between 1 to 100
		int temp=0;
		System.out.println("the prime numbers between 1 to 100");
		for(int i=2;i<=100;i++)
		{
			for(int j=2;j<=i-1;j++)
			{
				if(i%j==0)
				{
					temp=temp+1;
				}
			}
			if(temp==0)
			{
				System.out.println(i);
			}
			else
			{
				temp=0;
			}
		}
	
		
		int temp=0;
		for(int i=2;i<=100;i++)
		{
			for(int j=2;j<=i-1;j++)
			{
				if(i%j==0)
				{
					temp=temp+1;
				}
			}
			if(temp==0)
			{
				System.out.println(i);
			}
			else
			{
				temp=0;
			}
		}
		
			
		System.out.println("enter the number");
		int number=sc.nextInt();
		
		int firstnum=0;
		int secondnum=1;
		int nextnum;
		System.out.println("the feb series is");
		for(int i=1;i<=number;i++)
		{
			System.out.println(firstnum+" ");
			nextnum=firstnum+secondnum;
			firstnum=secondnum;
			secondnum=nextnum;
		}
		
		System.out.println("enter the first number");
		int num1=sc.nextInt();
		
		System.out.println("enter the second number");
		int num2=sc.nextInt();
		
		System.out.println("entet the third number");
		int num3=sc.nextInt();
		int number=1;
		
		for(int i=1;i<=number;i++)
		{
			
			if(i%num1==0 && i%num2==0 && i%num3==0)
			{
			System.out.println("LCM is "+i);
			break;
			}
			number++;
		
		
		// factorial of any any 
		System.out.println("enter a number");
		int number=sc.nextInt();
		
		int fact=1;
		for(int i=1;i<=number;i++)
		{
		  fact=fact*i;
		}
		System.out.println("factorial is "+fact);
		
		
		
		System.out.println("enter first number");
		int num1=sc.nextInt();
		
		System.out.println("enter second number");
		int num2=sc.nextInt();
		
		System.out.println("enter third number");
		int num3=sc.nextInt();
		
		
		for(int i=num3;i>=1;i--)
		{
			
			if(num2%num1==0 && num3%num1==0)
			{
				System.out.println("HCF is "+num1);
				break;
			}
			
			 if(num1%num2==0 && num3%num2==0)
			{
				System.out.println("HCF is "+num2);
				break;
			}
		     if(num1%num3==0 && num2%num3==0)
			{
				System.out.println("HCF is "+num3);
				break;
			}
		     if(num1%i==0 && num2%i==0 && num3%i==0)
				{
					System.out.println("HCF is "+i);
					break;
				}
		    
		     num3--;
		}
		
		
		int count1=0,count2=0,count3=0;
		for(int i=33;i<=999;i++)
		{
			if(i%3==0)
			{
				count1=count1+1;
				System.out.println("PINK");
			}
			else if(i%5==0)
			{
				count2=count2+1;
				System.out.println("YELLOW");
			}
			else if(i%3==0 && i%5==0)
			{
				count3=count3+1;
				System.out.println("PINK & YELLOW");
			}
		}
		System.out.println("PINK are="+count1);
		System.out.println("YELLO are="+count2);
		System.out.println("PINK & YELLOW="+count3);
		
		System.out.println("enter a number");
		int number=sc.nextInt();
		int fact=1;
		for(int i=1;i<=number;i++)
		{
			fact=fact*i;
		}
		System.out.println("factorial is = "+fact);
*/
		
	}
}