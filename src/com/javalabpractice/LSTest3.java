package com.javalabpractice;

import java.util.Scanner;
//digit of number

public class LSTest3 {

	public static void main(String[] args) {
		System.out.println("main method started!");
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number:");
		int n = sc.nextInt();
		System.out.println("enter the digit number:");
		int digit = sc.nextInt();
		int count = 0;
		for (int i = 1; i <= n; n = n / 10) {
			int rem = n % 10;
			if (rem == digit) {
				count++;
			}

		}

		System.out.println("digit:" + count + "times");
		sc.close();
	}

}
