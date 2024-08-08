package com.revature.chars;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharacterStream {

	public static void main(String[] args) {
		
		FileReader inputReader=null;
		FileWriter outputWriter=null;
		
		try {
			inputReader=new FileReader("E:\\Revature-Notes\\emp.txt");
			outputWriter=new FileWriter("E:\\Revature-Notes\\hello.txt");
			int c;
			while((c=inputReader.read())!=-1)
				outputWriter.write(c);
				//System.out.println(c);
				
			outputWriter.flush();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
