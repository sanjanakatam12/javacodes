package com.javalabpractice2;

public class Arrays15 {

	public static void main(String[] args) {

		int[] arr = { 1, 3, 2, 1, 1, 6 };

		int jump = 0;
		int i = 0;

		while (i < arr.length) {

			if (arr[i] == 0) {
				System.out.println("I am stuck at index " + i);
				break;
			}

			i = i + arr[i]; 
			jump++;

			if (i >= arr.length) {
				System.out.println("Exceeded array length");
				break;
			}
		}

		System.out.println("Total jumps: " + jump);

	}

}
