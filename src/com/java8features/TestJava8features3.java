package com.java8features;

@FunctionalInterface
interface In3{
	public abstract int sqrt(int a);
}

public class TestJava8features3 {

	public static void main(String[] args) {
		In3 i3 =a->{return a*a;
		};
		System.out.println(i3.sqrt(10));
		
		

	}

}
