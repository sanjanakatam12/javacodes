package com.logicalstatements;

import java.util.Scanner;

//switch case break default

public class LogicalStatements8 {

	public static void main(String[] args) {
		System.out.println("main method started");
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a jersey number");
		int jno = sc.nextInt();
		
		switch(jno) {
		case  7 -> System.out.println("ms dhoni");
		case  18 -> System.out.println("virat kohli");
		case  45 -> System.out.println("rohit sharma");
		case  1 -> System.out.println("kl rahul");
		case  8 -> System.out.println("ravindra jedeja");
		
		default -> System.out.println("unknown");
		
	
		
		
		}
		sc.close();
		
	}

}
