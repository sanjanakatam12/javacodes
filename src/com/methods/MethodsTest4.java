package com.methods;

import java.util.Scanner;
//No return type + with arguments

public class MethodsTest4 {
	static void getName(String sname) {
		System.out.println("User Name : " + sname);
	}

	static void getAge(int age) {
		System.out.println("User age : " + age);
	}

	static void userPhone(long phone) {
		System.out.println("User phone : " + phone);
	}
	public static void main(String[] args) {
		System.out.println("main method strated ");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name : ");
		String nm = sc.next();
		System.out.println("Enter your age : ");
		int age = sc.nextInt();
		System.out.println("Enter your phone : ");
		long phone = sc.nextLong();
	
		getName(nm);
		getAge(age);
		userPhone(phone);
		sc.close();
	}

	
}
