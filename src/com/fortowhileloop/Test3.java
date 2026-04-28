package com.fortowhileloop;
//find factors

import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {
		System.out.println("main method started");
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int n = sc.nextInt();

		int i = 1;
		while (i <= n / 2) {
			if (n % i == 0) {
				System.out.print(i + " ");
			}
			i++;

		}
		System.out.print(n);

		sc.close();

	}

}
