package com.logicalstatements;

import java.util.Scanner;

public class LogicalStatements11 {

	public static void main(String[] args) {
		System.out.println("main method started");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int a = sc.nextInt();
		System.out.println("Enter b number:");
		int b = sc.nextInt();
		System.out.println("Enter a symbol to proceed like + - * / %");
		String symb = sc.next();
		int result=0;
		
		switch(symb) {
		case "+" -> result = a+b;
		case "-" -> result = a-b;
		case "*" -> result = a*b;
		case "/" -> result = a/b;
		case "%" -> result = a%b;
		
		default -> System.out.println("invalid symbol");

		
		}
		System.out.println(result);
		sc.close();

				
	}

}
