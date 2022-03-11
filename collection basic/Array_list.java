package collectionBasic;
import java.util.ArrayList;
public class Array_list {

	public static void main(String[] args) 
	{
		ArrayList<Integer> list=new ArrayList<Integer>();
		
		for(int i=0;i<10;i++)
		{
			list.add(i);
			
		}
		for(int i=0;i<20;i++)
		{
			list.add(i);
		}
		System.out.println(list);
		
	}

}
