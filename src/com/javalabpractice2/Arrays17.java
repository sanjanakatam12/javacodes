package com.javalabpractice2;

public class Arrays17 {

	public static void main(String[] args) {
		int[] arr = { 2, 3, 1, 5, 7, 8, 4 };
		int max = 0;
		int min = 0;
		int ele = 0;

		for (int i = 0; i < arr.length; i++) {
			int count = 1;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[i])
					break;
				count++;

				for (int k = i - 1; j >= 0; j--) {
					if (arr[j] < arr[i])
						break;
					count++;

				}
				min = arr[i] * count;
				if (min > max)
					max = min;
				ele = arr[i];

				System.out.println();

			}

		}

	}

}
