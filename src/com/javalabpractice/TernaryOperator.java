package com.javalabpractice;

import java.util.Scanner;

public class TernaryOperator {

	public static void main(String[] args) {

		System.out.println("main method started!!!");

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the marks:");
		int marks = sc.nextInt();

		String grade = (marks >= 90 && marks <= 100) ? "A" :
				 	   (marks >= 80 && marks <= 90)  ? "B" :
				       (marks >= 70 && marks <= 80)  ? "C" :
				       (marks >= 50 && marks <= 70)  ? "D" :
				       (marks >= 35 && marks <= 50)  ? "E" :
				       (marks >= 0  && marks <= 35)   ? "F" :
				       "invalid marks";

		System.out.println("Student Grade:" + grade);
		
		sc.close();

	}

}
