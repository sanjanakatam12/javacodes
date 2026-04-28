package com.methods;
//1) No return type + no arguments

public class MethodsTest1 {

	void hello() {
		System.out.println("Hello Guys, Good evening !!");
	}

	public static void main(String[] args) {
		System.out.println("main method started !!");
	
		MethodsTest1 t = new MethodsTest1();
		
		MethodsTest1.welcome();

		t.hello();
		System.out.println("main method ended !");
	}

	public static void welcome() {
		System.out.println("Welcome to Vcube !");
	}
}
