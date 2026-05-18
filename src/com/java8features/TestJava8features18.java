package com.java8features;

import java.util.function.Supplier;

public class TestJava8features18 {

	public static void main(String[] args) {
		
		Supplier<String> s1 = () -> {
			String otp = "";

			// greater than or equal to 0.0 and less than 1.0.
			for (int i = 1; i <= 6; i++) {
				otp = otp + (int) (Math.random() * 10);// 257197
			}

			return otp;
		};

		System.out.println(s1.get());


	}

}
