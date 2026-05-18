package com.java8features.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TestStreams3 {

	public static void main(String[] args) {
		
		List<String> names= Arrays.asList("Nishitha","Nishitha","Aslesha","Pavitra","Sindhu","Sindhu","Navya","Tulasi","Triveni","Bala");
		
		List<String> names1 =names.stream()
			.map(String::toUpperCase)
			.sorted()
			.distinct()
			.limit(4)
			.collect(Collectors.toList());
		names1.forEach(System.out::println);
		
		System.out.println("+++++++++++++++++++");
	
		List<String> list= Arrays.asList("Nishitha","Aslesha","Pavitra","Sindhu","Navya","Tulasi","Triveni","Bala");
		List<String> list1=list.stream()
			.map(s-> s +"-vcube")
			.sorted()
			.collect(Collectors.toList());
		list1.forEach(System.out::println);
		
		List<Double> salaries = Arrays.asList(500000.00, 340000.00,600000.00,800000.00,700000.00);
		List<Double> updatedSalaries = salaries.stream()
												.map(d -> d + 6000.00)
												.sorted()
												.collect(Collectors.toList());
		updatedSalaries.forEach(System.out::println);

	}

}
