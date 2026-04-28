package com.logicalstatements;

import java.util.Scanner;

public class LogicalStatements21 {

	public static void main(String[] args) {
		System.out.println("main method started");
		Scanner sc =new Scanner(System.in);
		System.out.println("enter a number");
		int n =sc.nextInt();
		
		int r=0;
		String bin="";
		
		while(n!=0) {
			r=n%2;
			n=n/2;
			bin=r+bin;
			
		}
			System.out.println(" binary number is " + bin);
		sc.close();
	
		

	}

}
