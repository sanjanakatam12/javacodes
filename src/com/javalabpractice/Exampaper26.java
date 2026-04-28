package com.javalabpractice;

public class Exampaper26 {

	public static void main(String[] args) {
		int a = 12;
		int b = 5;
		System.out.println(a & b);
		System.out.println(a | b);
		System.out.println(a ^ b);
		System.out.println("****************");
		int x = 5;
		String result = (x > 0) ? (x % 2 == 0 ? "even" : "odd") : "negative";
		System.out.println(result);

	}

}
