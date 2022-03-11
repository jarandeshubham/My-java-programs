package methodObject;

public class MethodArguReturn 
{

	public int typethree(int a,int b)
	{
		int c=a+b;
		return c;
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		MethodArguReturn m=new MethodArguReturn();
		int p=m.typethree(10, 15);
		System.out.println("the addition is: "+p);
	}

}
