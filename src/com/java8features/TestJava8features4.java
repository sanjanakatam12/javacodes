package com.java8features;

@FunctionalInterface
interface In4{
	void method4();
}

public class TestJava8features4 {

	public static void main(String[] args) {
		In4 i = () -> {
			System.out.println("Hello method4");
			System.out.println("Hello method4");
			System.out.println("Hello method4");
			System.out.println("Hello method4");
		};
		i.method4();

	}

}
