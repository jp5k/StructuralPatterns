package com.pluralsight.decorator;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class DecoratorEverydayDemo {

	public static void main(String[] args) throws Exception{
		
		// Create instance of file, and write to output stream
		File file = new File("./output.txt");
		file.createNewFile();
		
		// OutputStream is base decorator, and FileOutputStream is instance of concrete decorator
		OutputStream oStream = new FileOutputStream(file);
		
		// Can write physical data out to the system
		// Allows us to daisy chain using different streams
		DataOutputStream doStream = new DataOutputStream(oStream);
		doStream.writeChars("text");
		
		doStream.close();
		oStream.close();
		
	}
	
}
