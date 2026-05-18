package com.java8features;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.IntPredicate;

public class TestJava8features19 {

	public static void main(String[] args) {
		
		IntPredicate i = i1 -> i1 > 100;
		System.out.println(i.test(150));

		BiPredicate<Integer, Integer> b1 = (i1, i2) -> i1 * i2 > 100;
		System.out.println(b1.test(15, 20));
		System.out.println(b1.test(9, 9));

		BiFunction<String, String, String> b2 = (s1, s2) -> s1.concat(s2).toUpperCase();
		System.out.println(b2.apply("Java is", "Simple "));
		
		BiConsumer<Integer, String> b3 = (age, name) ->{
				System.out.println("Student age is : " + age);
				System.out.println("Student Name is : " + name);
		};
		
		b3.accept(23, "Ramesh");

	}

}
