package com.java8features.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Person {
	String name;
	String city;

	Person(String name, String city) {
		this.name = name;
		this.city = city;
	}

	String getCity() {
		return city;
	}

	String getName() {
		return name;
	}
}

public class TestStreams8 {

	public static void main(String[] args) {
		
		Person p1 = new Person("Alice", "New York");
		Person p2 = new Person("Bob", "London");
		Person p3 = new Person("Charlie", "New York");

		List<Person> people = Arrays.asList(p1, p2, p3);
		Map<String, List<Person>> groupedByCity = people.stream()
														.collect(Collectors.groupingBy(Person::getCity));

		groupedByCity.forEach((city, list) -> {
			System.out.println(city + ": " + list
											 .stream()
											 .map(Person::getName)
											 .collect(Collectors.joining(", ")));
		});


	}

}
