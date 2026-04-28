package com.javalabpractice4;

import java.util.Scanner;

public class TestString2 {

	public static void main(String[] args) {

		System.out.println("main method started");

		Scanner sc = new Scanner(System.in);
		System.out.println("enter the String");
		String str = sc.nextLine();

		int count = str.length();
		String vowels = "";
		String consonents = "";

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);

			if (Character.isLetter(ch)) {
				if ("aeiou".indexOf(ch) != -1) {
					vowels += ch;

				} else {
					consonents += ch;
				}

			}
		}
		System.out.println("words of count:" + count);
		System.out.println("words of vowels:" + vowels);
		System.out.println("words of consonents:" + consonents);

		sc.close();
	}

}
