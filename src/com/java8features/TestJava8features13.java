package com.java8features;

import java.util.function.Consumer;

public class TestJava8features13 {

	public static void main(String[] args) {
		
		Consumer<Integer> c1 = (i) -> System.out.println(i * i * i);
		c1.accept(9);

		Consumer<String> c2 = (s) -> {
			System.out.println(s.length());
			System.out.println(s.toLowerCase());
			System.out.println(s.toUpperCase());
		};
		c2.accept("Srikanth");

	}

}
