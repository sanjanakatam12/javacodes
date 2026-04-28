package com.javalabpractice2;

public class Arrays11 {

	public static void main(String[] args) {

		int[] price = { 10, 1, 9, 6, 13, 27, 96 };

		int minPrice = price[0];
		int maxProfit = 0;
		int buyDay = 0;
		int sellDay = 0;
		int tempBuyDay = 0;

		for (int i = 1; i < price.length; i++) {

			if (price[i] < minPrice) {
				minPrice = price[i];
				tempBuyDay = i;
			}

			int profit = price[i] - minPrice;

			if (profit > maxProfit) {
				maxProfit = profit;
				buyDay = tempBuyDay;
				sellDay = i;
			}
		}

		System.out.println("Buy on Day: " + buyDay);
		System.out.println("Sell on Day: " + sellDay);
		System.out.println("Maximum Profit: " + maxProfit);
	}

}
