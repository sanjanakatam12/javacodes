package com.javalabpractice4;

import java.util.Scanner;

public class TestString1 {

	public static void main(String[] args) {

		System.out.println("main method started");

		Scanner sc = new Scanner(System.in);

		System.out.println("enter the name");
		String name = sc.nextLine();

		boolean found = false;

		for (int i = 0; i < name.length(); i++) {
			char ch = name.charAt(i);

			int count = 0;

			for (int j = 0; j < name.length(); j++) {
				if (ch == name.charAt(j)) {
					count++;

				}
			}
			if (count == 1) {
				System.out.println("first non repeating character:" + ch);
				found = true;
				break;

			}
		}
		if (!found) {
			System.out.println("no non repeating charcter found");

		}
		sc.close();

	}

}
