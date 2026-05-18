package com.java8features.streams;

import java.util.HashSet;
import java.util.Set;
import java.util.function.Consumer;

public class TestStreams2 {

	public static void main(String[] args) {
		
Set<String> cities = new HashSet<>();
		
		cities.add("Hyderabad");
		cities.add("Guntur");
		cities.add("Vizag");
		cities.add("KarimNagar");
		cities.add("Bezawada");
		
		Consumer<String> c = s-> {
			 System.out.print(s + " ");
		};
		
//		:: double colon operator or Method reference 
//		cities.forEach(System.out::println);
//		cities.forEach(s-> System.out.print(s + " "));
		cities.forEach(c);

	}

}
