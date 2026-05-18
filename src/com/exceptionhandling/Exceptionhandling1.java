package com.exceptionhandling;

import java.util.Scanner;

public class Exceptionhandling1 {

	public static void main(String[] args) {
		System.out.println("main method started");
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the a number");
		int a =sc.nextInt();
		System.out.println("enter the b number");
		int b=sc.nextInt();
		
		try {
			System.out.println("in try");
		
		System.out.println(a/b);
		}catch(Exception e) {
			System.err.println("in catch");
			
			System.err.println(e.getMessage());
			
		}
		
		System.out.println("main method ended");
		System.out.println("main method ended");
		sc.close();


	}

}
