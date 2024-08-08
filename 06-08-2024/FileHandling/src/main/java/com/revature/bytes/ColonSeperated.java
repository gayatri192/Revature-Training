package com.revature.bytes;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ColonSeperated {
	

	public static void main(String[] args) {
		FileInputStream input;
		FileOutputStream output;
		
		try {
			input=new FileInputStream("E:\\Revature-Notes\\emp.txt");
			output=new FileOutputStream("E:\\Revature-Notes\\emp.txt");
			int c;
			while((c=input.read())!=-1)
				output.write(c);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
