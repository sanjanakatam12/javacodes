package com.javalabpractice;

import java.util.Scanner;

public class OperatorsTest3 {

	public static void main(String[] args) {
		System.out.println("main method started!!!!");

		Scanner sc = new Scanner(System.in);

		System.out.println("enter the marks: ");
		int marks = sc.nextInt();

		if (marks >= 40) {
			System.out.println("your pass in exam");
		} else {
			System.out.println("your fail in exam!! better luck next time");
		}
		sc.close();
	}

}
