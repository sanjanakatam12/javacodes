package com.javalabpractice4;

import java.util.Arrays;
import java.util.Scanner;

public class TestString3 {

	public static void main(String[] args) {

		System.out.println("main method started");

		Scanner sc = new Scanner(System.in);
		System.out.println("enter a string name");
		String str1 = sc.nextLine();

		System.out.println("enter a another string name");
		String str2 = sc.nextLine();

		char[] arrstr1 = str1.toCharArray();
		char[] arrstr2 = str2.toCharArray();

		Arrays.sort(arrstr1);

		Arrays.sort(arrstr2);

		boolean status = Arrays.equals(arrstr1, arrstr2);

		if (status) {
			System.out.println("given string is anagram");
		} else {
			System.out.println("given String is not anagram");
		}
		sc.close();
		System.out.println("main method ended");

	}

}
