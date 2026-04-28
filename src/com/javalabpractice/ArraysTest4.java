package com.javalabpractice;

public class ArraysTest4 {

	public static void main(String[] args) {

		int[] arr = { 5, 9, 10, 11, 5, 6, 1 };

		int temp = arr[0];
		arr[0] = arr[2];
		arr[2] = temp;

		int last = arr[6];
		arr[6] = arr[5];
		arr[5] = arr[4];
		arr[4] = last;

		for (int num : arr) {
			System.out.print(num + " ");
		}

	}

}
