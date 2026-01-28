package com.streams;

import java.io.*;

public class StoreAndRetrivePrimitiveData {
	public static void main(String[] args) {
		File file = new File("file.dat");
		
		try(DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(file))){
			int rollno = 7;
			String name = "Student 1";
			double gpa = 8.0;
			
			dataOutputStream.writeInt(rollno);
			dataOutputStream.writeUTF(name);
			dataOutputStream.writeDouble(gpa);
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		try(DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file))){
			int rollno = dataInputStream.readInt();
			String name = dataInputStream.readUTF();
			double gpa = dataInputStream.readDouble();
			
			System.out.println(rollno + " " + name + " " + gpa);
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
