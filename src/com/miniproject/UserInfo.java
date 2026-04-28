package com.miniproject;

import java.util.Scanner;

public class UserInfo implements UserInterface {
	Scanner sc = new Scanner(System.in);
	Userdetails user = new Userdetails();

	@Override
	public void createAccount() {
		System.out.println("Enter user name:");
		String name = sc.next();

		System.out.println("Enter account number:");
		long accNo = sc.nextLong();

		System.out.println("Set PIN:");
		int pin = sc.nextInt();

		System.out.println("Enter initial balance:");
		long balance = sc.nextLong();

		user.setName(name);
		user.setAccountNo(accNo);
		user.setPin(pin);
		user.setBalance(balance);

		System.out.println("Account Created Successfully");

	}

	@Override
	public void displayUser() {
		System.out.println("User Name: " + user.getName());
		System.out.println("Account Number: " + user.getAccountNo());
		System.out.println("Balance: " + user.getBalance());

	}

	@Override
	public void deposit() {
		System.out.println("Enter amount to deposit:");
		long amount = sc.nextLong();

		user.setBalance(user.getBalance() + amount);

		System.out.println("Amount deposited successfully");
		System.out.println("Updated Balance: " + user.getBalance());
	}

	@Override
	public void withDraw() {
		System.out.println("Enter PIN:");
		int enteredpin = sc.nextInt();

		if (enteredpin == user.getPin()) {

			System.out.println("Enter amount to withdraw:");
			long amount = sc.nextLong();

			if (amount <= user.getBalance()) {

				user.setBalance(user.getBalance() - amount);

				System.out.println("Withdraw Successful");
				System.out.println("Remaining Balance: " + user.getBalance());

			} else {
				System.out.println("Insufficient Balance");
			}

		} else {
			System.out.println("Wrong PIN");
		}
	}

	@Override
	public void checkBalance() {
		
		System.out.println("Enter PIN:");
		int enteredPin = sc.nextInt();

		if (enteredPin == user.getPin()) {

			System.out.println("Current Balance: " + user.getBalance());

		} else {
			System.out.println("Wrong PIN");
		}

	}

	@Override
	public void pinChange() {
		
		

		System.out.println("Enter old PIN:");
		int oldPin = sc.nextInt();

		if (oldPin == user.getPin()) {

			System.out.println("Enter new PIN:");
			int newPin = sc.nextInt();

			user.setPin(newPin);

			System.out.println("PIN Changed Successfully");

		} else {
			System.out.println("Wrong PIN");
		}
	}

}
