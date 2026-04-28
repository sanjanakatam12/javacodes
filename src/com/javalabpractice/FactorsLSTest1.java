package com.javalabpractice;

import java.util.Scanner;

public class FactorsLSTest1 {

	static void Factornum(int num) {

		for (int i = 1; i <= 10; i++) {

			if (i != 0 && i % 2 == 0) {
				System.out.print(i + " ");

			}

		}
	}

	public static void main(String[] args) {

		System.out.println("main method started!!");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int num = sc.nextInt();
		Factornum(num);

		System.out.println("main method ended");
		sc.close();
	}

}
