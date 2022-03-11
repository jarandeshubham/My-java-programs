package string_java;

public class StringArrangeInAlphabetDicti {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

		String[] s={"shubham","vinod","balu","nan","Dnyaneshwar"};
		
		for(int i=0;i<s.length;i++)
		{
			for(int j=i+1;j<s.length;j++)
			{
				if(s[i].compareTo(s[j])>0)
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
	}

}
