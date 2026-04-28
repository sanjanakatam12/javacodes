package com.javalabpractice2;

public class Patterns5 {

	public static void main(String[] args) {

		String s = "KOHLI";
		int n = s.length();
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i == j || i + j == n - 1)
					System.out.print(s.charAt(i) + " ");

				else
					System.out.print(" ");

			}
			System.out.println();
		}

	}

}
