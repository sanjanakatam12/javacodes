package com.javalabpractice4;

import java.util.Scanner;

public class TestString6 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the sentence:");
		String input = sc.nextLine();

		String[] words = input.split(" ");
		String[] result = new String[words.length];

		for (String word : words) {

			int position = 0;
			String text = "";

			for (char ch : word.toCharArray()) {
				if (Character.isDigit(ch)) {
					position = ch - '0';
				} else {
					text += ch;
				}
			}

			result[position - 1] = text;
		}

		for (String word : result) {
			System.out.print(word + " ");
		}
		sc.close();
	}

}
