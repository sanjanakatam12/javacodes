package com.java8features.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Teststreams6 {

	public static void main(String[] args) {
		
		List<List<String>> lls = Arrays.asList(Arrays.asList("a", "b"), Arrays.asList("c", "d"),
				Arrays.asList("e", "f"));
		
		lls.forEach(System.out::println);
		System.out.println("*********************");

		List<String> ls = lls.stream().flatMap(List::stream).collect(Collectors.toList());
		ls.forEach(System.out::println);

	}

}
