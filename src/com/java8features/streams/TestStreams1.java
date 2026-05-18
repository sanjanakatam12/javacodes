package com.java8features.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TestStreams1 {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(10, 20, 31, 34, 36, 76, 87, 91);
		List<Integer> list1=list.stream()
								.filter(i->i%2==0)
								.collect(Collectors.toList());
		System.out.println(list1);
		
		List<String> names = Arrays.asList("Tilak", "Rohit", "Dhoni", "Virat", "Sky", "Pandya", "Abishek", "Vaibhav");
		List<String> names1 = names.stream()
								   .filter(s-> s.contains("i"))
								   .sorted()
								   .collect(Collectors.toList());
		System.out.println(names1);
		
		List<Double> salries = Arrays.asList(500000.00, 340000.00,600000.00,800000.00,700000.00);
		List<Double> salries1 = salries.stream().filter(i-> i>=600000.00).collect(Collectors.toList());
			
//		salries1.forEach(s-> System.out.println(s));
		salries1.forEach(System.out::println);
		
		

	}

}
