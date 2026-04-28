package com.javalabpractice;

public class Program1 {

	byte a = 56;
	byte b = 67;

	int c = 32;
	int d = 45;

	short e = 41;
	short f = 23;

	void byteoper() {

		System.out.println("the add operation:" + (a + b));
		System.out.println("the sub operation:" + (a - b));
		System.out.println("the mul operation:" + (a * b));
		System.out.println("the div operation:" + (a / b));
	}

	void intoper() {
		System.out.println("the add operation:" + (c + d));
		System.out.println("the sub operation:" + (c - d));
		System.out.println("the mul operation:" + (c * d));
		System.out.println("the div operation:" + (c / d));
	}

	void shortoper() {
		System.out.println("the add operation:" + (e + f));
		System.out.println("the sub operation:" + (e - f));
		System.out.println("the mul operation:" + (e * f));
		System.out.println("the div operation:" + (e / f));
	}

	public static void main(String[] args) {

		Program1 p = new Program1();
		p.byteoper();
	}

}
