package com.javalabpractice4;

public class Arrays1 {

	public static void main(String[] args) {

		int[] arr = { 10, 20, 30, 40, 50, 60 };
		int[] n = new int[arr.length];

		for (int i = 0; i < arr.length; i++) {
			
			if (i == 0) {
				n[i] = arr[i] + arr[i + 1];
			} else if (i == arr.length - 1) {
				n[i] = arr[i] + arr[i - 1];
			} else {
				n[i] = arr[i] * 2;
			}
		}

		for (int num : n) {
			System.out.print(num + " ");
		}
	}

}
