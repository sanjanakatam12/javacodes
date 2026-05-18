package com.accessmodifier1;

public class Testaccess2 {

	public static void main(String[] args) {
		System.out.println("main method started !");

		// if the constructors are private, we cannot create objects outside of the
		// classes.
//		TestAccessDemo1 t1 = new TestAccessDemo1();

		Testaccess1 t1 = new Testaccess1();
		// Accessing the default data members outside of the classes of same package
		System.out.println(t1.a2);
		System.out.println(t1.name2);
		t1.method2();

		// Accessing the protected data members outside of the classes of same package
		System.out.println(t1.a4);
		System.out.println(t1.name4);
		t1.method4();

		// The field TestAccessDemo1.a1 is not visible
		// The field TestAccessDemo1.name1 is not visible
		// The method method1() from the type TestAccessDemo1 is not visible
		// Note: We cannot access private data from one class to another class.

//		System.out.println(t1.a1);
//		System.out.println(t1.name1);
//		t1.method1();

		System.out.println("main method ended !");

	}

}
