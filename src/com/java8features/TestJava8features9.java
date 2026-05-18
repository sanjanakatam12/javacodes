package com.java8features;


class TestA {
	void taste() {
		System.out.println("Biriyani is too spicy ");
	}
}


public class TestJava8features9 {

	public static void main(String[] args) {
		TestA a = new TestA() {
			@Override
			void taste() {
				System.out.println("Biriyani is very tasty without spice ! ");
			}
		};

		a.taste();

	}

}
