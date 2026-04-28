package com.javalabpractice;

import java.util.Scanner;

public class FactorialLS {

	public static void main(String[] args) {
		System.out.println("main method started!");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int num = sc.nextInt();
		int factorial = 1;
		for (int i = 1; i <= num; i++) {
			factorial =factorial*i;

		}
		System.out.println("factorial=" + factorial);

		System.out.println("main method ended");
		sc.close();

	}

}
