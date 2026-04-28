package com.javalabpractice;
//with return type with arguments

//static void add(int a , int b) {
//int c=a+b;
//System.out.println("addition:" + c);
//int z=a-b;
//int p=a*b;
//int r=a/b;
//System.out.println("sub:" + z);
//System.out.println("mul:" + p);
//System.out.println("div:" + r);
//return;}

public class Intmethod {

	static int add(int a, int b) {
		int c = a + b;
		System.out.println("add" + c);
		sub(c, 5);
		return c;
	}

	static int sub(int a, int b) {
		int z = a - b;
		System.out.println("sub" + z);
		mul(z, 6);

		return z;
	}

	static int mul(int a, int b) {
		int p = a * b;
		System.out.println("mul" + p);
		div(p, 2);
		return p;
	}

	static int div(int a, int b) {
		System.out.println("div" + (a / b));

		return a / b;
	}

	public static void main(String[] args) {
		add(20, 10);

	}

}
