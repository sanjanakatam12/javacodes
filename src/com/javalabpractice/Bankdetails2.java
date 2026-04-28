package com.javalabpractice;

import java.util.Scanner;
public class Bankdetails2 {
	static int balance=5000;
	String name;
	int accountNo;
	
	 static void createaccount(String n, long a) {
		String name="sanjana";
		long account=0123;
		System.out.println("create account sucsessfully");
		System.out.println(name);
		System.out.println(account);
			
	}
	static void checkbalance() {
		System.out.println("current balance:" + balance);
		
		
	}
	static void depositmoney(double amount) {
		double debalance=balance-amount;
		System.out.println("amount deposited:" + debalance);
		
		
	}
	static void withdraw(double amount) {
		double withdrawbalance=balance-amount;
		System.out.println("amount wthdraw:"+ withdrawbalance); 
	
	}
	
	static void calculateintrest(double rate) {
		double intrest=balance*rate/100;
		System.out.println("intrest:"+intrest);
	}

	public static void main(String[] args) {
		System.out.println("main method started");
	Scanner sc= new Scanner(System.in);
	System.out.println("enter the name:");
	String n=sc.nextLine();
	System.out.println("enter account number:");
	long a=sc.nextLong();
	System.out.println("enter depositamount:");
	double deposit=sc.nextDouble();
	System.out.println("enter withdrawamount:");
	double withdraw=sc.nextDouble();
	System.out.println("enter intrest amount: ");
	double rate=sc.nextDouble();
	
	createaccount(n,a);
	depositmoney(deposit);
	withdraw(withdraw);
	calculateintrest(rate);
	checkbalance();

	sc.close();

	}

}
