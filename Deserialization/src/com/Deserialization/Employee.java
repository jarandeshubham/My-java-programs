package com.Deserialization;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.Serializable;

public class Employee  {

	
	FileInputStream fs=null;
	ObjectInputStream ois=null;
	
	try {
		
		fs=new FileInputStream("C:\\Users\\Shubham\\Desktop\\StudentInfo.txt");
		ois=new ObjectInputStream(fs);
		
		
	}
	
}
