package methodObject;

public class AdditionOftwo
{
	int c;
	public int getdata(int a,int b)
	{
	        c=a+b;
	       return c;
	    
	}
	public void display()
	{
		
		System.out.println("addition is:"+c);
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		AdditionOftwo a=new AdditionOftwo();
		a.getdata(10,15);
		a.display();
		
	}

}
