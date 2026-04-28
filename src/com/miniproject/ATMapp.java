package com.miniproject;

import java.util.Scanner;

public class ATMapp {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		UserInfo ui = new UserInfo();

		System.out.println("***************** WELCOME TO ATM APPLICATION *****************");

		int choice;

		do {
			System.out.println("ATM MENU");
			System.out.println("1. Create Account");
			System.out.println("2. Display User");
			System.out.println("3. Deposit");
			System.out.println("4. Withdraw");
			System.out.println("5. Check Balance");
			System.out.println("6. Change PIN");
			System.out.println("7. Exit");

			System.out.print("Enter choice: ");
			choice = sc.nextInt();

			switch (choice) {

			case 1:
				ui.createAccount();
				break;

			case 2:
				ui.displayUser();
				break;

			case 3:
				ui.deposit();
				break;

			case 4:
				ui.withDraw();
				break;

			case 5:
				ui.checkBalance();
				break;

			case 6:
				ui.pinChange();
				break;

			case 7:
				System.out.println("Thank you for using ATM");
				break;

			default:
				System.out.println("Invalid choice");
			}

		} while (choice != 7);

		sc.close();
	}
}
