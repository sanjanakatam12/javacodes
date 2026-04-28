package com.javalabpractice2;

public class Arrays19 {

	public static void main(String[] args) {

		int[] arr = { 12, 132, 1, 34, 57 };
		int n = arr.length;

		for (int i = 0; i < n; i++) {

			int next;

			if (i == n - 1) {
				next = arr[0]; 
			} else {
				next = arr[i + 1];
			}

			
			int sum = 0;
			int temp = next;

			while (temp > 0) {
				sum = sum + temp % 10;
				temp = temp / 10;
			}

			
			int multiplier = 1;
			int t = sum;

			while (t > 0) {
				multiplier = multiplier * 10;
				t = t / 10;
			}

			int result = arr[i] * multiplier + sum;

			System.out.print(result + " ");
		}
	}

}
