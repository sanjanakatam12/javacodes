package com.logicalstatements;

import java.util.Scanner;

public class LogicalStatements4 {

	public static void main(String[] args) {
		System.out.println("main method started!!");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a age:");
		int age = sc.nextInt();
		if (age > 18) {
			System.out.println("You are eligible for voting");
			System.out.println("wlcome to vcube");

		}
		if (age < 18) {
			System.out.println("arey babu!! neku inka time unadi ra");
			System.out.println("good evening");

		}
		System.out.println("main method ended");
		sc.close();

	}

}
