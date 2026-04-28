package com.logicalstatements;

import java.util.Scanner;

//if else and else if

public class LogicalStatements6 {

	public static void main(String[] args) {
		System.out.println("main method started");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your marks:");
		double marksp=sc.nextDouble();
		if(marksp > 100 || marksp <0) {
			System.out.println("invalid marksp");
			
		}
		else if(marksp>=90) {
			System.out.println("Grade A");
		}
		else if(marksp>=80) {
			System.out.println("Grade B");
		}
		else if(marksp>=70) {
			System.out.println("Grade C");
		}
		else if(marksp>=60) {
			System.out.println("Grade D");
			
		}
		else if(marksp>=35) {
			System.out.println("Just passed");
		}
		else {
			System.out.println("Dont waste your time on moblie!! learn properly");
			System.out.println("you are failed!!");
		}
		sc.close();


	}

}
