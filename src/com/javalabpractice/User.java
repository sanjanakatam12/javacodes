package com.javalabpractice;

public class User {

	int chocolateprice = 15;
	int cookieprice = 10;

	int chocolatebought = 10;
	int cookiebought = 5;

	public static void main(String[] args) {

		int totalmoney = 450;

		int totalcost = (15 * 10) + (10 * 5);

		int remainingmoney = totalmoney - totalcost;
		System.out.println("totalcost: " + totalcost);
		System.out.println("remainingmoney: " + remainingmoney);

	}

}
