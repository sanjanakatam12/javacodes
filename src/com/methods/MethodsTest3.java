package com.methods;

//No return type + with arguments : BODMAS
public class MethodsTest3 {

	static void addition(int a, int b) {
		System.out.println("in addition method");
		System.out.println("Sum of two numbers : " + (a + b));
	}

	public static void main(String[] args) {
		System.out.println("main method started ");
//			Calling addition
		addition(100, 200);
		System.out.println("main method ended ");
	}
}
