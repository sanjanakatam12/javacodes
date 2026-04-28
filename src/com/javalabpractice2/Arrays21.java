package com.javalabpractice2;

// round figure student marks

public class Arrays21 {

	public static void main(String[] args) {

		int[] arr = { 92, 86, 99, 18, 36, 41 };
		int[] output = new int[arr.length];

		for (int i = 0; i < arr.length; i++) {

			int rem = arr[i] % 10;

			if (rem >= 5) {
				output[i] = arr[i] + (10 - rem);
			} else {
				output[i] = arr[i] - rem;
			}

		}
		System.out.println("round figure of marks:");
		for (int i = 0; i < output.length; i++) {
			System.out.print(output[i] + " ");
		}

	}

}
