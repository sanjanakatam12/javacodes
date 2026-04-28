package com.javalabpractice;

import java.util.Scanner;

public class ArraysTest5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("how many times rotates");
		int r = sc.nextInt();

		int[] arr = { 10, 20, 30, 40, 50 };

		rotationaarray(arr, r);

		System.out.println("reverse of array");
		for (int n : arr) {
			System.out.print(n + " ");
		}
		sc.close();

	}

	static void rotationaarray(int[] arr, int r) {
		int start = 0;
		int end = arr.length - 1;

		reverseofArray(arr, start, end);

		reverseofArray(arr, start, r - 1);

		reverseofArray(arr, start, r);

	}

	static void reverseofArray(int arr[], int start, int end) {
		int temp = 0;

		while (start < end) {
			temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
	}
}
