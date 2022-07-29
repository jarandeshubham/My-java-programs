package encap;

public class Test {

	public static void main(String[] args)
	{
		Encapsulation encapsulation=new Encapsulation();
		encapsulation.setStudentName("shubham");
		
		System.out.println("student name is: "+encapsulation.getStudentName());
		
		encapsulation.setStudentId(102);
		
		System.out.println("student id is: "+encapsulation.getStudentId());
	}
	
}
