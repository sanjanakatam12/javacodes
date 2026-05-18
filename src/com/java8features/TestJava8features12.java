package com.java8features;

import java.util.function.Function;

public class TestJava8features12 {

	public static void main(String[] args) {
		
		Function<String, Integer> f1 = (s) -> s.length();
		System.out.println(f1.apply("Javasrikanth"));

		Function<Integer, Integer> f2 = i -> i * i * i * i;
		System.out.println(f2.apply(10));

		Function<String, String> f3 = s -> s.toUpperCase();
		System.out.println(f3.apply("Java IS SImple"));
		
		Function<Integer, String> f4 = s -> String.valueOf(s) + "Java";
		System.out.println(f4.apply(100));


	}

}
