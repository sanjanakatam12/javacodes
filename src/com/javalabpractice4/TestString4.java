package com.javalabpractice4;

import java.util.Scanner;

public class TestString4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter a String");
		String str = sc.nextLine();

		int[] arr = new int[127];

		for (int i = 0; i < str.length(); i++) {
			
			arr[str.charAt(i)]++;

		}

		for (int i = 0; i < 127; i++) {
			if (arr[i] > 0) {
				System.out.println((char) i + " : " + arr[i]);
			}
		}
		sc.close();

	}

}
