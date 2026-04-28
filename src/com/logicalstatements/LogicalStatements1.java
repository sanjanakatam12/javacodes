package com.logicalstatements;

import java.util.Scanner;
//return switch
public class LogicalStatements1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int n = sc.nextInt();
		System.out.println(getDay(n));
		sc.close();
	}
	static String getDay( int n) {
		return switch(n) {
		case 1 -> "sunday";
		case 2 -> "monday";
		case 3 -> "tuesday";
		case 4 -> "wednesday";
		case 5 -> "thursday";
		case 6 -> "friday";
		case 7 -> "saturday";
		
		default -> "Invalid day";
		
		};
	}

}
