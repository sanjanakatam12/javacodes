package com.logicalstatements;

import java.util.Scanner;

public class LogicalStatements9 {

	public static void main(String[] args) {
		System.out.println("main method started");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a T-shirt size");
		int size=sc.nextInt();
		
		switch(size) {
		case 34 -> System.out.println("xtra small size");
		case 36 -> System.out.println("small size");
		case 38 -> System.out.println("medium size");
		case 40 -> System.out.println("large size");
		case 42 -> System.out.println("xtra large size");
		case 44 -> System.out.println("xtra xtra large size");
		default -> System.out.println("xtra small size");


		}
		sc.close();
		
	}

}
