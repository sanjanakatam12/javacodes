package com.exceptionhandling;

import java.util.Scanner;

public class Exceptionhandling3 {

	public static void main(String[] args) {
		System.out.println("main method started");

		Scanner sc = new Scanner(System.in);

		try {
			System.out.println("in try");
			System.out.println("enter a number");
			int a = sc.nextInt();
			System.out.println("enter b  number");
			int b = sc.nextInt();

			int c = a / b;

			System.out.println(c);
			String name = "vcube";
			System.out.println(name.charAt(3));

			String name1 = null;
			System.out.println(name1.charAt(3));

		} catch (Exception e) {
			System.err.println("in catch");
			e.printStackTrace();
		} finally {
			System.out.println("in finally");
		}
		sc.close();

	}

}
