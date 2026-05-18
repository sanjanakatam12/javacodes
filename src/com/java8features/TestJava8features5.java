package com.java8features;

//Functional interface vs Inheritance 
@FunctionalInterface
interface In5 {
	void method5();
}

@FunctionalInterface
interface In6 extends In5 {
}


public class TestJava8features5 {

	public static void main(String[] args) {
		In6 i = () -> System.out.println("Hello method5");
		i.method5();

	}

}
