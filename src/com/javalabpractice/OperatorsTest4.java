package com.javalabpractice;

import java.util.Scanner;

public class OperatorsTest4 {

	public static void main(String[] args) {
		System.out.println("main method started!!!");

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the attendance percentage:  ");
		int attendance = sc.nextInt();
		System.out.println("Enter your marks:  ");
		int marks= sc.nextInt();
		

		if (attendance >= 75 && marks >=60) {
			System.out.println("Your eligible for scholarship  ");

		} else {
			System.out.println("Your not eligible for scholarship  ");

		}
		sc.close();
	}

}
