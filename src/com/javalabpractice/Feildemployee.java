package com.javalabpractice;

//insurence=500
//dailyrate  1500
//base amount
//total amount
//amount 1500
public class Feildemployee {

	public static void main(String[] args) {

		String company = "Wipro";
		int amount = 1500;
		int insurance = 500;
		int days = 12;

		welcome(company);
		int baseamount = baseAmount(amount, days);
		int total = totalAmount(baseamount, insurance);

		System.out.println("Daily Rate = " + amount);
		System.out.println("Insurance = " + insurance);
		System.out.println("Base Amount = " + baseamount);
		System.out.println("Total Amount = " + total);
	}

	static void welcome(String company) {
		System.out.println("Welcome to " + company);
	}

	static int baseAmount(int dailyRate, int days) {
		return dailyRate * days;
	}

	static int totalAmount(int baseamount, int insurance) {
		return baseamount + insurance;
	}

}
