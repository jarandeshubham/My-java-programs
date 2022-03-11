package methodObject;

public class ReturnType {

	public int typeone()
	{
		int a=5;
		int b=6;
		int c=a+b;
		return c;
	}
	public void typetwo()
	{
		int a=5;
		int b=4;
		int c=a+b;
		System.out.println("addition is:"+c);
	}
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		ReturnType t=new ReturnType();
		t.typeone();
		
		int p=t.typeone();
		System.out.println("addition is:"+p);
		t.typetwo();
	}

}
