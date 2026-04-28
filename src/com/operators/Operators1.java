package com.operators;

import java.util.Scanner;

//Arithmetic operators +,-,*,/,%

public class Operators1 {

	public static void main(String[] args) {
		System.out.println("main method started");
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter a number:");
		int a=sc.nextInt();
		
		System.out.println("Enter b number: ");
		int b=sc.nextInt();
		
		System.out.println("Addition of two numbers:" + (a+b));
		System.out.println("subtraction of two numbers:" + (a-b));
		System.out.println("multiplication of two numbers:" + a*b);
		System.out.println("division of two numbers:" + a/b);
		System.out.println("modulus of two numbers:" + a%b);
		System.out.println("main method ended");

		sc.close();
	}

}
