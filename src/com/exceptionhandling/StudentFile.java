package com.exceptionhandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class StudentFile {

	public static void main(String[] args) throws IOException {
		System.out.println("main method started");
		
		File f =new File("C:\\java\\java1\\sanjana2.txt");
		
		FileWriter fw = new FileWriter(f);
		
		fw.write('A');
		
		
		fw.write(100);
		fw.write("hello");
		
		
		
		fw.close();
		
		
		
		
		
		
		

	}

}
