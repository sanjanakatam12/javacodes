package com.java8features;

import java.sql.Date;
import java.util.function.Supplier;

public class Testjava8features14 {

	public static void main(String[] args) {
		
		Supplier<String> s1 = () -> {
			String str = "hello";
			return str;
		};

		System.out.println(s1.get());
		Supplier<Date> s2 = () -> new Date(2);
		System.out.println(s2.get());
	

	}

}
