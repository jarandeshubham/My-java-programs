package string_java;

public class Remove_Duplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s=new String("rabbit and tortoise technology");
		int leng=s.length();
		char ch=' ';
		int count=0;
		for(int i=0;i<leng;i++)
		{
			for(int j=0;j<i;j++)
			{
				
				if(s.charAt(i)==s.charAt(j))
				{
					if(s.charAt(i)==ch && s.charAt(j)==ch)
					{
						
					}
					else
					{
						count++;
					}
					
				}
			}
			if(count==0)
			{
				System.out.print(s.charAt(i));
			}
			else
			{
				count=0;
			}
		}	
	}
}
