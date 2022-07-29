package velocity;

public class RemoveDuplicates {

	public static void main(String[] args) {
		
		String s="rabbit and tortoise technology solution";
		 char ch=' ';
		 int n=0;
		for(int i=0;i<s.length();i++)			
		{
			int count=0;
			
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
			
		}
		System.out.println();
		System.out.println("Total duplicates are: "+n);

	}

}
