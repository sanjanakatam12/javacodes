package com.exceptionhandling;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class Exceptionhandling4 {

	public static void main(String[] args) {
		
		try {
			FileReader fr=new FileReader("C:\\java\\java1\\sanjana.txt");
			
			try {
				
				int a=fr.read();
				
				while(a!=-1) {
					System.out.print((char)a);
					a=fr.read();
					
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
				}
				
			} catch (IOException e) {
				System.out.println("IOException");
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			System.out.println("FileNotFoundException");
			e.printStackTrace();
		}
//		
//		

		

	}

}
