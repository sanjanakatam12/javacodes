package com.javalabpractice;

import java.util.Scanner;

// prime numbers
// all prime number are odd numbers
// all odd numbers are not a prime numbers
public class LSTest5 {
	static boolean Checkprime(int n) {
		boolean status = true;

		if (n == 0 || n == 1) {
			return false;
		}
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {//2%2
				status = false;
				break;

			}

		}
		return status;

	}

	public static void main(String[] args) {
		System.out.println("main method started");
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number:");
		int n = sc.nextInt();
		int alc=0;
		for (int i = 0; i <= n; i++) {
			if (Checkprime(i)) {
				alc++;
				if(alc%2!=0) {
					System.out.println(alc+" - "+i + " ");

					
				}
			}
		}
		sc.close();

	}

}
