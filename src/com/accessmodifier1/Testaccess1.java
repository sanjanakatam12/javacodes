package com.accessmodifier1;

//Illegal modifier for the interface TestIn1; 
//only public, default strictfp & abstract are permitted
interface TestIn1 {

}

//Illegal modifier for the class TestAccessDemo1; 
//only public,default,strictfp, abstract & final are permitted

public class Testaccess1 {
//	private TestAccessDemo1(){
//	System.out.println("private Constructor called !");
//}

	public Testaccess1() {
		System.out.println("public Constructor called !");
	}

	static {
		System.out.println("static block executed");
	}

	{
		System.out.println("instance block executed");
	}

// protected
	protected int a4 = 1;
	protected String name4 = "Rahul";

	protected void method4() {
		System.out.println("method4 called ");
	}

// public data members
	public int a3 = 45;
	public String name3 = "Rohit";

	public void method3() {
		System.out.println("method3 called ");
	}

// default data members
	int a2 = 18;
	String name2 = "Virat";

	void method2() {
		System.out.println("method2 called ");
	}

// private data members
	private int a1 = 4;
	private String name1 = "Abhishek";

	private void method1() {
		System.out.println("method1 called !");
	}

	public static void main(String[] args) {
		System.out.println("main method started !!");

		Testaccess1 t1 = new Testaccess1();
		// Accessing the private data members within the class
		System.out.println(t1.a1);
		System.out.println(t1.name1);
		t1.method1();

		// Accessing the default data members within the class
		System.out.println(t1.a2);
		System.out.println(t1.name2);
		t1.method2();

		// Accessing the protected data members within the class
		System.out.println(t1.a4);
		System.out.println(t1.name4);
		t1.method4();

		System.out.println("main method ended !");
	}

	private class TestInnerDemo1 {

	}

}
