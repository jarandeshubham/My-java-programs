package velocity;

public class Local {

  static int count;
	
	public Local()
	{
		count++;
	}
	public static void main(String[] args)
	{
      Local local1=new Local();
      
      Local local2=new Local();
      
      Local local3=new Local();
      
      Local local4=new Local();
      
      System.out.println(Local.count);
   
	}

}
