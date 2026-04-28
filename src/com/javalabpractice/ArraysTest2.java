package com.javalabpractice;

public class ArraysTest2 {

	public static void main(String[] args) {

		int[] a = { 1, 2, 2, 3, 4, 4, 5 };
		boolean[] b = new boolean[a.length];

		for (int i = 0; i < a.length; i++) {
			boolean flag = true;

			if (b[i]) {
				continue;
			}

			for (int j = i + 1; j < a.length; j++) {
				if (a[i] == a[j]) {
					b[j] = true;
				}
			}

			if (a[i] <= 1) {
				flag = false;
			}

			for (int k = 2; k <= a[i] / 2; k++) {
				if (a[i] % k == 0) {
					flag = false;
					break;
				}
			}

			if (flag) {
				System.out.println(a[i]);
			}
		}

	}
}