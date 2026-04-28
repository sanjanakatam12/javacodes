package com.javalabpractice;

public class Program2 {

	int number = 5675;

	public static void main(String[] args) {

		int thousands = 5675 / 1000;
		int hundreds = (5675 % 1000) / 100;
		int tens = (5675 % 100) / 10;
		int ones = (5675 % 10);
		System.out.println("thousands:" + thousands);

		System.out.println("hundreds:" + hundreds);
		System.out.println("tens:" + tens);
		System.out.println("ones:" + ones);

	}

}
