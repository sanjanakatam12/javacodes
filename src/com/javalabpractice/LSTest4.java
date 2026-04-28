package com.javalabpractice;

import java.util.Scanner;

public class LSTest4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number:");
		int n = sc.nextInt();

		int sum = 0;

		for (int i=1;i<=n ; n = n/ 10) {
			int digit = n % 10;
			sum = sum + digit;
		}

		System.out.println("Sum of digits = " + sum);

		sc.close();
	}

}
