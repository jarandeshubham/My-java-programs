package velocity;


import java.io.FileWriter;
import java.io.IOException;


public class FileWrite {

	public static void main(String[] args) throws IOException {


		FileWriter fw=null;
		
		
		try {
		
			fw=new FileWriter("C:\\Users\\Shubham\\Desktop\\Information.txt");
			
			fw.write("Hello all this is my info");
			
			System.out.println("data is return successfully");
			 
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		finally {
			
			fw.close();
		}
		

	}

}
