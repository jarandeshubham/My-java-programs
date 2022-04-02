package string_java;

public class Removchardu {

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
				
				if(((s.charAt(i)==s.charAt(j)) || ((s.charAt(i)) && (s.charAt(i))))
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
