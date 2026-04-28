package com.javalabpractice;

import java.util.Scanner;

public class LSTest9 {

	public static void main(String[] args) {
		System.out.println("main method started!");
		System.out.println("enter a number :");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int sq = n * n;
		int sum = 0;
		int r = 0;

		while (sq > 0) {
			r = sq % 10;
			sq = sq / 10;
			sum = sum + r;

		}

		System.out.println("the given is :" + sum);
		if (sum == n) {
			System.out.println("given number is a neon number");
		} else {
			System.out.println("given number is not a neon number");

		}
		sc.close();

	}

}
