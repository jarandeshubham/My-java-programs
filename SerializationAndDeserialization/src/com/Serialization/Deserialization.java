package com.Serialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Deserialization {

	public static void main(String[] args) throws IOException {

		
		FileInputStream fs=null;
		ObjectInputStream ois=null;
		
		try {
			
			fs=new FileInputStream("C:\\Users\\Shubham\\Desktop\\StudentInfo.txt");
			ois=new ObjectInputStream(fs);
			Object obj=ois.readObject() ;
			Student student=(Student)obj;
			System.out.println("id>>"+student.getId());
			System.out.println("name>>"+student.getName());
			System.out.println("city>>"+student.getCity());
		
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		finally {
			fs.close();
			ois.close();
		}

	}

}
