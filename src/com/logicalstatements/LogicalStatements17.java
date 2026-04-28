package com.logicalstatements;

import java.util.Scanner;

//reverse number of the digit and given number is polindrome number or not

public class LogicalStatements17 {

	public static void main(String[] args) {
		System.out.println("main method started");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int temp = n;
		int r = 0;
		int rev = 0;

		while (n != 0) {
			r = n % 10;
			n = n / 10;
			rev = rev * 10 + r;
		}
		System.out.println("reverse number :" + rev);

		if(temp==rev) {
			System.out.println("given number is polidrome number");
			
		}
		else {
			System.out.println("given number is not polidrome number");
		}
		sc.close();

	}

}
