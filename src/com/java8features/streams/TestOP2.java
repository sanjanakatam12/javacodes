package com.java8features.streams;

import java.util.Optional;

class Employee {
	String email;

	public Optional<String> getEmail() {
		return Optional.ofNullable(email);
	}

}

public class TestOP2 {

	public static void main(String[] args) {
		
		System.out.println("main method started ");
		Employee emp = new Employee();
//		System.out.println(emp.email.toLowerCase());

		String email = emp.getEmail().orElse("UNknown");
		System.out.println(email.toLowerCase());

		System.out.println("main method ended ");

	}

}
