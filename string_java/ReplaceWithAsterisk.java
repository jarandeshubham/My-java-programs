package string_java;

public class ReplaceWithAsterisk {

	public static void main(String[] args) {
		
		String s="shubham";
		int leng=s.length();
		String k="*";
		String m="*";
	
		for(int i=0;i<leng;i++)
		{
			System.out.print(k);
			k=k+m;
			for(int j=i+1;j<leng;j++)
			{
				System.out.print(s.charAt(j));
			}
			System.out.println();
			
		}

	}

}
