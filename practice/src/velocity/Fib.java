package velocity;

public class Fib {

	public static void main(String[] args) {
		
		int firstnum=0;
		int secondnum=1;
		int nextnum;
		
		for(int i=1;i<=20;i++)
		{
			System.out.println(firstnum);  //0 1 1
			
			nextnum=firstnum+secondnum;  //0+1=1 1+1=2
			firstnum=secondnum;          //1 1
			secondnum=nextnum;           //1 2
		}
	}
}
