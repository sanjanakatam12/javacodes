package com.fortowhileloop;

import java.util.Scanner;

public class Test4 {

	public static void main(String[] args) {
		System.out.println("main method started");
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int n = sc.nextInt();
		System.out.println("enter the size");
		int size=sc.nextInt();

		int i = 1;
		while (i <= size) {
			System.out.println(n + "X" + i + "=" + n * i);

			i++;
		}
		sc.close();

	}

}
