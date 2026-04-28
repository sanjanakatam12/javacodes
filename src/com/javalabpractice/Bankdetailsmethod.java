package com.javalabpractice;

import java.util.Scanner;

public class Bankdetailsmethod {

	static int balance = 5000;

	static void checkbalance() {

	}

	static void deposit(int amount) {
		int depositamount = balance + amount;
		System.out.println("depositeamount:" + depositamount);

	}

	static void withdraw(int amount1) {

		int withdrawamount = balance - amount1;
		System.out.println("withdrawamount:" + withdrawamount);

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the deposit amount:");
		int amount = sc.nextInt();
		System.out.println("Enter the withdrawamount:");
		int amount1 = sc.nextInt();

		// method calling
		deposit(amount);
		withdraw(amount1);
		checkbalance();

		sc.close();

	}

}
