package velocity;

public class ObjectCount {

	static int count;
	
	ObjectCount()
	{
		count++;
	}
	public static void main(String[] args) {
		
		ObjectCount objectCount1=new ObjectCount();
		ObjectCount objectCount2=new ObjectCount();
		ObjectCount objectCount3=new ObjectCount();
		ObjectCount objectCount4=new ObjectCount();
		ObjectCount objectCount5=new ObjectCount();
		ObjectCount objectCount6=new ObjectCount();
		
		System.out.println("total objects are: "+count);
		
	}

}
