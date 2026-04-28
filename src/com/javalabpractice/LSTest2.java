package com.javalabpractice;

import java.util.Scanner;

public class LSTest2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int month=sc.nextInt();
		System.out.println(getmonth(month));
		sc.close();
		
		
	}
	static String getmonth(int m) {
		return switch (m) {
		case 1 -> "januray" ;
		case 2 -> "february" ;
		case 3 -> "march" ;
		case 4 -> "april" ;
		case 5 -> "may" ;
		case 6 -> "june" ;
		case 7 -> "july" ;
		case 8 -> "august" ;
		case 9 -> "september" ;
		case 10 -> "october" ;
		case 11 -> "november" ;
		case 12 -> "december" ;
		default -> "invalid month";
		
		};
	}

}
