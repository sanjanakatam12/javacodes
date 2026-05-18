package com.java8features;

@FunctionalInterface
interface In1{
	public abstract void methos1();
	
	
}

public class TestJava8features1 {

	public static void main(String[] args) {
		In1 t1 =()->{
			System.out.println("java8 is more simple!!");
		};
		t1.methos1();

		
	}

}
