package com.java8features.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TestStreams7 {

	public static void main(String[] args) {
		
List<String> sentences = Arrays.asList("hello world", "java stream flatmap");
		
		List<String> words = sentences.stream()
            .flatMap(sentence -> Arrays.stream(sentence.split(" ")))
            .collect(Collectors.toList());

        System.out.println(words);  // Output: [hello, world, java, stream, flatmap]


	}

}
