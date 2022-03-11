package string_java;

public class RemoveExtraSpace {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		String s="   the  capital    of     Maharashtra is  Mumbai   ";
		s=s.trim();
		String s1="";
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)==' '&& s.charAt(i+1)==' ')
			{
				
			}
			else
			{
				s1=s1+s.charAt(i);
			}
		}
		System.out.println(s1);
	}

}
