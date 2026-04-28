package com.exceptionhandling;

import java.util.Scanner;

public class Exceptionhandling2 {

	public static void main(String[] args) {

		int arr[] = { 75, 80, 65, 90 };
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Enter student index : ");
			int index = sc.nextInt();
			System.out.println("Enter no of subjects : ");
			int subject = sc.nextInt();
			int average = arr[index] / subject;
			System.out.println(average);
		} catch (Exception e) {
			System.err.println(e.getMessage());

		}
		System.out.println("main method ended");

	}

}
