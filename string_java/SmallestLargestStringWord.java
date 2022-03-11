package string_java;

public class SmallestLargestStringWord {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		String[] s= {"dfhdhf","hdufhduhf","khasuab","d","dbca"};
		
		for(int i=0;i<s.length;i++)
		{
			for(int j=i+1;j<s.length;j++)
			{
				if(s[i].length()>s[j].length())
				{
					String temp=s[i];
					s[i]=s[j];
					s[j]=temp;
				}
			}
		}
		for(int i=0;i<s.length;i++)
		{
			System.out.print(s[i]+" ");
		}
		System.out.println();
		System.out.println("smallest string is: \n"+s[0]);
		System.out.println("largest string is:\n"+s[s.length-1]);	
	}

}
