package com.java8features.streams;

import java.util.Arrays;
import java.util.List;

public class TestStreams9 {

	public static void main(String[] args) {
		
		List<String> names = Arrays.asList("John", "Jane", "Jack", "Jill", "Jerry", "Jim");
		names.parallelStream()
			 .forEach(name -> System.out.println(Thread.currentThread().getName() + " - " + name));


	}

}
