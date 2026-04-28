package com.javalabpractice;

public class ArraysTest3 {

	public static void main(String[] args) {

		int[] arr = { 23, 15, 12, 78 };
		int minIndex = 0;

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] < arr[minIndex]) {
				minIndex = i;
			}

		}
		int minValue = arr[minIndex];

		for (int i = minIndex; i > 0; i--) {
			arr[i] = arr[i - 1];
		}
		arr[0] = minValue;
		
		for(int n: arr) {
			System.out.println(n + " ");
		}

	}
}
