package com.miniproject;

public class Userdetails {

	private long accountNo;
	private String name;
	private int pin;
	private double balance;

	void setAccountNo(long accountNo) {
		this.accountNo=accountNo;

	}

	long getAccountNo() {
		return accountNo;

	}

	void setName(String name) {
		this.name=name;

	}

	String getName() {
		return name;

	}

	void setPin(int pin) {
		this.pin=pin;

	}

	int getPin() {
		return pin;

	}

	void setBalance(double balance) {
		this.balance=balance;

	}

	double getBalance() {
		return balance;

	}

}
