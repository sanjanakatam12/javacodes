package com.logicalstatements;

import java.util.Scanner;

//Nested if else

public class LogicalStatements7 {

	public static void main(String[] args) {
		System.out.println("welcome to vcube matrimonial");
		Scanner sc = new Scanner(System.in);
		System.out.println("enter is your name");
		String name = sc.next();
		System.out.println("Okay M:" + name + " shall we start the coversation...?");
		System.out.println("can you please enter you assets & salary info");
		double assets = sc.nextDouble();
		System.out.println("salary also..");
		double salary = sc.nextDouble();

		if (assets >= 50000000.00 && salary >= 2500000.00) {
			System.out.println("oh okay!!");
			System.out.println("can you please enter your age:");
			int age = sc.nextInt();
			if (age >= 25 && age <= 28) {
				System.out.println("oh nice!!");
				System.out.println("Enter your weight and height");
				double weight = sc.nextDouble();
				System.out.println("height");
				double height = sc.nextDouble();

				if (weight >= 60 && weight <= 72 && height >= 5.5 && height <= 6.2) {
					System.out.println("your profile almost matches to our requirments!!we have few more questions");
					System.out.println("do you have sibilings");
					boolean sibstatus = sc.nextBoolean();
					if (sibstatus) {
						System.out.println("sorry you can leave for the day");

					} else {
						System.out.println("we will come back latter");
					}

				} else {
					System.out.println("betetr to join gym!! or you are short");

				}
			} else {
				System.out.println("your age is not matching with our profile");

			}

		} else {
			System.out.println("better luck next time");
		}
		sc.close();
	}

}
