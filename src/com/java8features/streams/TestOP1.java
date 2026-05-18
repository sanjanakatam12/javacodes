package com.java8features.streams;

import java.util.Optional;

public class TestOP1 {

	public static void main(String[] args) {
	
		System.out.println("main method started ");
//		String name = null;
//		System.out.println(name.length()); // NullPointerException

		Optional<String> name1 = Optional.ofNullable("Srikanth");
		System.out.println(name1);// Optional[Srikanth]

		Optional<String> name2 = Optional.ofNullable(null);
		System.out.println(name2);// Optional.empty
		System.out.println(name2.isEmpty());
		
		System.out.println(name1.orElse("Unknown"));//Srikanth
		System.out.println(name2.orElse("Unknown"));//Unknown


		System.out.println("main method ended ");

	}

	}


