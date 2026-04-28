package com.exceptionhandling;
import java.io.File;
import java.io.IOException;

public class Exceptionhandling5 {

	public static void main(String[] args) {
		System.out.println("main method started");
		
		File f= new File("C:\\java\\java1\\sanjana.txt");
		try {
			f.createNewFile();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		System.out.println("main method ended");

		
		

	}

}
