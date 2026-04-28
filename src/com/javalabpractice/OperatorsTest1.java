package com.javalabpractice;

public class OperatorsTest1 {

	public static void main(String[] args) {
		int p = 3;
		int q = 6;

		System.out.println(p++);
		System.out.println(--q);
		System.out.println(++p);
		System.out.println(q--);

		System.out.println(p++ + --q + ++p + q--);

		System.out.println("P value:" + p);
		System.out.println("Q value:" + q);
		
		int a = 5;
		int b = ++a + a++ + --a;
		
		System.out.println(b);


	}

}
