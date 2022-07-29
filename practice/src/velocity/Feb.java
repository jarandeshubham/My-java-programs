package velocity;

public class Feb {

	public static void main(String[] args) {
		
		int first=0;
		int second=1;
		int nextnum=0;
		System.out.println(first);
		System.out.println(second);

		for(int i=1;i<=20;i++)
		{
			nextnum=first+second;
			first=second;
			second=nextnum;
			
			System.out.println(nextnum);
		}
	}
}
