package com.java8features.streams;

import java.util.Optional;

public class TestOP3 {

	public static void main(String[] args) {

		String card = null;
		Optional<String> atmCard = Optional.ofNullable(card);
		System.out.println(atmCard.orElse("Temporary Card Issued"));

		Optional<String> name = Optional.of("Java");
		System.out.println(name);

	}

}
