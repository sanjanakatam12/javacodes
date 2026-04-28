package com.javalabpractice2;

public class Arrays4 {

	public static void main(String[] args) {

		int[] arr = { 5, 9, 10, 11, 5, 6, 1 };
		int n = arr.length;

		for (int i = 2; i >= 0; i--) {
			System.out.print(arr[i] + " ");
		}

		for (int i = 3; i < n; i++) {
			System.out.print(arr[i] + " ");
		}

	}

}
