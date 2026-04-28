package com.logicalstatements;

import java.util.Scanner;

public class LogicalStatements22 {

	public static void main(String[] args) {
		System.out.println("main method started");
		Scanner sc =new Scanner(System.in);
		System.out.println("enter a number");
		int n =sc.nextInt();
		
		int decimal=0;
		int base=1;
		
		
		while(n!=0) {
			int lastDigit = n % 10;
			n = n / 10;
			base = base * 2;
			decimal = decimal + (lastDigit * base);
			
			
		}
			System.out.println(" decimal number is " + decimal);
		sc.close();
	}

}
