package methods;

public class StudentMarks 
{

	public static void main(String[] args) {
		
		int eng=58, marathi=67, math=78, java=85, cpp=84;
		
		int total=eng+marathi+math+java+cpp;
		
		int average=total/5;
		
		System.out.println("total marks of student= "+total);
		System.out.println("average is= "+ average);
	}
}
