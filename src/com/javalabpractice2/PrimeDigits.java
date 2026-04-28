package com.javalabpractice2;

public class PrimeDigits {

	public static void main(String[] args) {

		int num = 21312313;

		int temp = num;

		while (temp > 0) {
			int r = temp % 10;
			temp = temp / 10;

			if (isprime(r)) {
				
				System.out.println(r);

			}

		}

	}

	private static boolean isprime(int r) {
		return false;
	} 

}
