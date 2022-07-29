package velocity;

public class ThisKeyword {

	int a=20;
	int b=30;
	
	
	void add()
	{
		System.out.println(a);
	}
	
	public static void main(String[] args) {
		
		ThisKeyword thisKeyword=new ThisKeyword();
		thisKeyword.add();
	}
	
}
