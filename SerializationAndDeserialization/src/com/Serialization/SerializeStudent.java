package com.Serialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializeStudent {

	public static void main(String[] args) throws IOException
	{
		Student student=new Student();
		
		student.setId(101);
		student.setName("balaji");
		student.setCity("Nanded");
		
		FileOutputStream fs=null;
		ObjectOutputStream os=null;
		
		try {
			
			fs=new FileOutputStream("C:\\Users\\Shubham\\Desktop\\StudentInfo.txt");
			os=new ObjectOutputStream(fs);
			
			os.writeObject(student);
			
		}catch(Exception e)
		{
			System.out.println(e);
		}
		finally {
			fs.close();
			os.close();
		}
	}
	
	
}
