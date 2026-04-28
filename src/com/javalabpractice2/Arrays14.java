package com.javalabpractice2;

public class Arrays14 {

	public static void main(String[] args) {
		int[] arr = { 1, 3, 2, 1, 1, 6 };

		int start = 0;
		int jumps = 0;
		int end = 0;

		for (int i = 0; i < arr.length-1 ; i++) {
			start = Math.max(start, i + arr[i]);

			if (i == end) {
				jumps++;
				end = start;

			}

		}
		System.out.println("maximum of jumpes:" +jumps);

	}

}
