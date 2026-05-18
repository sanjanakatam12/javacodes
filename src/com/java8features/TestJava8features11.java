package com.java8features;

import java.util.function.Predicate;

public class TestJava8features11 {

	public static void main(String[] args) {
		System.out.println("main method started ");

		Predicate<Integer> p1 = i -> i % 2 == 0;
		System.out.println(p1.test(10));// true
		System.out.println(p1.test(11));// false
		System.out.println(p1.test(15));// false

		Predicate<String> p2 = s -> s.length() > 5;
		System.out.println(p2.test("Java is simple"));// true

		Predicate<Double> p3 = salary -> salary > 50000.00;
		System.out.println(p3.test(60000.00));


	}

}
