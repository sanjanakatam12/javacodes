package com.javalabpractice;

//float with return with arguments
public class Floatmethod {

	 float add(float a, float b) {
		float c = a + b;
		System.out.println("add:" + c);
		sub(c, 5);
		return c;
	}

	 float sub(float a, float b) {
		float z = a - b;
		System.out.println("sub:" + z);
		mul(z, 6);

		return z;
	}

	 float mul(float z, float b) {
		float p = z * b;
		System.out.println("mul:" + p);
		div(p, 2);
		return p;
	}

     float div(float p, float b) {
		System.out.println("div:" + (p / b));

		return p / b;
	}

	public static void main(String[] args) {
		Floatmethod f = new Floatmethod();
		f.add(20, 50);

	}
}
