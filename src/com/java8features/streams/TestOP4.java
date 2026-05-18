package com.java8features.streams;

import java.util.Optional;

public class TestOP4 {

	public static void main(String[] args) {
	
		String[] names = { "Abhishek", "Virat", "Aditya", "Tilak", null, "kalssen", null, "Srikanth" };

		for (String name : names) {
			Optional<String> op = Optional.ofNullable(name);
			
			if (op.isPresent()) {
				System.out.println(op.get().toUpperCase());
			} else {
				System.out.println("name is not available ");
			}

		}


	}

}
