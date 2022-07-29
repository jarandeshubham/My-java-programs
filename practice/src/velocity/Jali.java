package velocity;

public class Jali {
	
	public static void main(String[] args) {

		int count=0;
		
	int firstnum=0;
	int secondnum=1;
	int nextnum;
	
	for(int i=1;i<=20;i++)   //i=1 i=2 i=3
	{
		System.out.println(firstnum);  // 0 1 1 2
		nextnum=firstnum+secondnum;   //0+1=1 1+1=2 1+2=3
		firstnum=secondnum;           //1   1  2
		secondnum=nextnum;            //1   2  3
	}

	}

}