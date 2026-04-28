package com.javalabpractice2;

public class Arrays13 {

	public static void main(String[] args) {

		int[] arr = { 1, 12, 133, 15, 2 };

		for (int i = 0; i < arr.length; i++) {

			int n = arr[i];
			int temp = n;
			int count = 0;
			while (temp > 0) {
				count++;
				temp = temp / 10;
			}

			arr[i] = 10 * n + count;

			System.out.print(arr[i] + " ");

		}

	}

}
