package velocity;

public class FebSeries {

	public static void main(String[] args) {
		
		int firstnum=0;
		int secondnum=1;
		int nextnum;
		
		for(int i=1;i<=20;i++) // i=1   i=2   
		{
			System.out.println(firstnum);  
			
			nextnum=firstnum+secondnum; 
		    firstnum=secondnum;         
		    secondnum=nextnum;          
		}

	}

}
