package com.javalabpractice;

public class Temparature {

	public static void main(String[] args) {
		int fahrenhiet = 55;
		int celsius = 33;

		int tofahrenhiet = celsius * 9 / 5 + 32;
		int tocelsius = fahrenhiet - 32 * 9 / 5;

		// float fahrenhiet=5.6f;
		// float celsius=3.2f;

		// float tofahrenhiet=celsius*9/5+32;
		// float tocelsius=fahrenhiet-32*9/5;

		// double fahrenhiet =9.6;
		// double celsius= 2.6;
		// double tocelsius = fahrenhiet-32*5/9;
		// double tofahrenhiet = celsius*9/5+32;

		System.out.println(tofahrenhiet);
		System.out.println(tocelsius);

	}

}
