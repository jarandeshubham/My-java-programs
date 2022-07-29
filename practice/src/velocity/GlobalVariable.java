package velocity;

public class GlobalVariable {

	int k;
	
	boolean pra;
	
	static int p;
	
	
	void print()
	{
		System.out.println(k);
		System.out.println(pra);
		System.out.println(p);
	}
	
	public static void main(String[] args) {
		
		GlobalVariable globalVariable=new GlobalVariable();
		
		globalVariable.print();
				

	}

}
