package com.javalabpractice;

public class OperatorsTest2 {

	public static void main(String[] args) {
		int a = 3;
		int b = 4;
		int resl = a++ + ++a - b++ - --b + a++ - a++;
		System.out.println(resl);
		System.out.println(a);
		System.out.println(b);

		int resl1 = b++ + a + a - --b + resl + ++a + --b;
		System.out.println(resl1);
		System.out.println(a);
		System.out.println(b);
		System.out.println(resl);

	}

}
