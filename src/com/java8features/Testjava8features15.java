package com.java8features;

import java.util.function.Predicate;

public class Testjava8features15 {

	public static void main(String[] args) {
		
		System.out.println("main method started ");
		String[] names = { "Sachin", "Mahendra SIngh Dhoni", "Rohit", "Rahul", "Virat Kohli", "Jadeja" };

		Predicate<String> p1 = (s) -> s.toLowerCase().contains("o");
		Predicate<String> p2 = (s) -> s.toLowerCase().contains("i");
		Predicate<String> p3 = (s) -> s.length() > 5;

		for (String name : names) {
			if (p1.or(p2).or(p3).negate().test(name)) {
				System.out.println(name);
			}
		}

	}

}
