package com.exceptionhandling;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Exceptionhandling6 {

	public static void main(String[] args) {

		try {
			FileReader r = new FileReader("C:\\\\java\\\\java1\\\\sanjana.txt");
			BufferedReader b = new BufferedReader(r);
			String t = "";

			while ((t = b.readLine()) != null) {
				System.out.println(t);
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
