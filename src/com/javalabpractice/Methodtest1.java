package com.javalabpractice;

public class Methodtest1 {

	static void add(int a, int b) {

		int c = a + b;
		System.out.println("value of c:" + c);
		subb(c, 100);
	}

	static void subb(int x, int y) {
		int z = x - y;
		System.out.println("subtraction:" + z);
		mul(z, 30);

	}

	static void mul(int p, int q) {
		int r = p * q;
		System.out.println("multipilication:" + r);
	}

	public static void main(String[] args) {
		System.out.println("main method startted");

		add(100, 200);

	}

}
