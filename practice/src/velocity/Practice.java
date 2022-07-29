package velocity;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Practice {

	public static void main(String[] args) throws IOException {

		FileInputStream fs=null;
		Scanner sc=null;
		try {
			
			fs=new FileInputStream("C:\\Users\\Shubham\\Desktop\\info.txt");
			sc=new Scanner(fs);
			
			while(sc.hasNextLine())
			{
				System.out.println(sc.nextLine());
			}
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		finally {
			fs.close();
			sc.close();
		}
	}

}
