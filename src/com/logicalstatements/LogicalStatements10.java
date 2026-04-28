package com.logicalstatements;

import java.util.Scanner;

public class LogicalStatements10 {

	public static void main(String[] args) {
		System.out.println("main method started");
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a weak name:");
		String day=sc.next();
		
		switch(day) {
		case "monday" -> {
			System.out.println("all mondays is lazy day");
			System.out.println("but i love vcube");
		}
		case "tuesday", "wednesday", "thursday" ->{
			System.out.println("routine days");
		}
		case "friday" -> {
			System.out.println("weakend mood on");
			
		}
		case "staurday","sunday" ->{
			System.out.println("happy days! happy weakend");
			
		}
		default -> System.out.println("unknown day");
						
		
		}
		sc.close();
		
	}

}
