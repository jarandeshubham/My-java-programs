package methods;

public class Student 
{

	String getStudentName(String name)
	{
		return name;
	}
	
	public static void main(String[] args) {
		
		Student student=new Student();
		
		System.out.println("student name is="+student.getStudentName("shubham"));
	}
	
}
