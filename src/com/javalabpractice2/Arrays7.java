package com.javalabpractice2;
//merge of two elements;
public class Arrays7 {

	public static void main(String[] args) {

		int[] a = { 1, 2, 3, 4 };
		int[] b = { 5, 6, 7 };

		int[] c = new int[a.length + b.length];
		int k = 0;
		for (int i = 0; i < a.length; i++) {
			c[k] = a[i];
			k++;
		}
		for (int i = 0; i < b.length; i++) {
			c[k] = b[i];
			k++;
		}
		for (int i = 0; i < c.length; i++) {
			System.out.print(c[i] + " ");
		}

	}

}
