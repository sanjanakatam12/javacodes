package com.methods;

import java.util.Scanner;

public class MethodsTest7 {
	static void studentInfo(String fname, String lname) {
		System.out.println("firstname:" + fname);
		System.out.println("lastname:" + lname);
	}
	static void studentage(int age) {
		System.out.println("age:" + age);

	}
	static void studentweight(double weight) {
		System.out.println("weight:" + weight);

  	}
    static void studenthight(float hight) {
		System.out.println("hight:" + hight);

	}

	static void studentphone(long phone) {
		System.out.println("phoneno:" + phone);

	}
	static void studentgender(char c) {
		System.out.println("gender:" + c);

	}
	static void studentpresent(boolean present) {
		System.out.println("present:" + present);

	}
	public static void main(String[] args) {
		 System.out.println("main method started");
	  	Scanner sc = new Scanner(System.in);
	  	System.out.println("Enter your FirstName:");
	    String fname = sc.nextLine();
	    System.out.println("Enter your lastName:");
	    String lname = sc.next();
		System.out.println("enter your age:");
	    int age = sc.nextInt();
		System.out.println("enter your weight:");
		double weight = sc.nextDouble();
		System.out.println("enter your hight");
		float hight = sc.nextFloat();
		System.out.println("enter your phone no:");
		long phone = sc.nextLong();
		System.out.println("enter your gender:");
		char c = sc.next().charAt(0);
		System.out.println("is present ?");
		boolean present = sc.nextBoolean();

		studentInfo(fname, lname);
		studentage(age);
		studentweight(weight);
		studenthight(hight);
		studentphone(phone);
		studentgender(c);
		studentpresent(present);
		System.out.println("main method ended");
		sc.close();

	}

					
}

