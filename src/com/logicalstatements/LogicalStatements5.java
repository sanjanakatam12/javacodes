package com.logicalstatements;

import java.util.Scanner;

public class LogicalStatements5 {

	public static void main(String[] args) {
		System.out.println("main method started!");
		Scanner sc = new Scanner(System.in);
		System.out.println("Are you attending the classes 90%...?");
		boolean areYouAttendingClassesDaily = sc.nextBoolean();
		System.out.println("Are you completing assignments daily...?");
		boolean areYouComplitingAssignmentsDaily = sc.nextBoolean();
		System.out.println("Are you attending exam every week...?");
		boolean areYouAttendingThExam = sc.nextBoolean();
		System.out.println("Are you attending mock interviwes every week...?");
		boolean areYouAttendingTheMocks = sc.nextBoolean();

		if (areYouAttendingClassesDaily && areYouComplitingAssignmentsDaily 
				&& areYouAttendingThExam && areYouAttendingTheMocks) {
			System.out.println("you will get a job in 6 months");

		} else {
			System.out.println("pray thegod daily");
		}
		sc.close();

	}

}
