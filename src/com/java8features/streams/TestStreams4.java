package com.java8features.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class TestStreams4 {

	public static void main(String[] args) {
		
		long count = Stream.of("apple", "banana", "cherry").filter(s -> s.contains("a")).count();
		System.out.println(count); // Output: 2

		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);

		int sum = numbers.stream().filter(n -> n % 2 == 0)// 2 4 6
				.map(n -> n * n) // 4 16 36
				.reduce(0, Integer::sum);
		System.out.println(sum); // Output: 56 (4 + 16 + 36)


	}

}
