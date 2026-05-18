package com.java8features.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class TestStreams5 {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(9, 8, 1, 2, 34, 56, 87, 98);
		List<Integer> list1 = list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		list1.forEach(System.out::println);

		int min = list.stream().min(Integer::compare).get();
		System.out.println("min value : " + min);
		
		int max = list.stream().max(Integer::compare).get();
		System.out.println("Max value : " + max);
		

	}

}
