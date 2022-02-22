package string_java;

public class Remove_char {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="rabbit and tortoise technology";
		int leng=s.length();
		char ch='o';
	    char gh='t';
		for(int i=0;i<leng;i++)
		{
		
			if(s.charAt(i)==ch ||s.charAt(i)==gh)
			{
				
			}
			else
			{
				System.out.print(s.charAt(i));
			}
		}
		
	}

}
