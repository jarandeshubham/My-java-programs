package velocity;

public class Table 
{

	void multiplication(int no)
	{
		for(int i=1;i<=10;i++)
		{
			int mul=no*i;
			System.out.println(no+"*"+i+"="+mul);
		}
	}
	
	public static void main(String[] args) 
	{
		
		Table table=new Table();
		table.multiplication(5);
	}
}
