package com.operators;

public class Operators3 {

	public static void main(String[] args) {

		int a = 10;
		int b = 11;
		System.out.println(a++);// 10 --> 11
		System.out.println(b--);// 11--> 10
		System.out.println(b++);// 10--> 11
		System.out.println(a--);// 11 --> 10
		System.out.println(++b);// 12
		System.out.println(++a);// 11
		System.out.println(a--);// 11 --> 10
		System.out.println(b--);// 12 --> 11
		System.out.println(--a);// 9
		System.out.println(--b);// 10
		// C ---> 9 + 10 + 10 + 10 --> 39
		// 10 + 9 + 9 + 10 --> 38
		System.out.println(a++ + b-- + a-- + ++b);// 39 38 40 37 36
		System.out.println("A value : " + a);// 9
		System.out.println("B value : " + b);// 10

		// 9 - 10 + 8 + 10
		System.out.println(--b - ++b + --a + b++);
		System.out.println( a++ + --b - ++b + ++a + a-- + b-- + a + b + b - a + a++);
	}
}
