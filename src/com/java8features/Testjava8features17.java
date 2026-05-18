package com.java8features;

import java.util.function.Consumer;
import java.util.function.Function;

class Movie {
	String name;

	public Movie(String name) {
		super();
		this.name = name;
	}

}

public class Testjava8features17 {

	public static void main(String[] args) {
		
		Consumer<Movie> c1 = (m) -> {
			System.out.println(m.name);
			System.out.println("Movie Intro ");
		};

		Consumer<Movie> c2 = (m) -> {
			System.out.println(m.name);
			System.out.println("Movie Interval ");
		};

		Consumer<Movie> c3 = (m) -> {
			System.out.println(m.name);
			System.out.println("Movie Climax ");
		};

		Movie m = new Movie("Varanasi");
		c1.andThen(c2).andThen(c3).accept(m);

		Function<Integer, Integer> f1 = (i) -> i * i * i;
		Function<Integer, Integer> f2 = (i) -> i * 2;

		System.out.println(f1.andThen(f2).apply(2));// 16
		System.out.println(f1.compose(f2).apply(2));// 64

	

		
		

	}

}
