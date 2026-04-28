package com.logicalstatements;

import java.util.Scanner;

//armstrong number

public class LogicalStatements20 {

	public static void main(String[] args) {
		System.out.println("main method started");
		Scanner sc =new Scanner(System.in);
		System.out.println("enter a number");
		int n =sc.nextInt();
		
		String digit=Integer.toString(n);
		int digitCount= digit.length();
		
		//another method 
		
		int temp=n;
		int r = 0;
		int sump=0;
		
		while(n!=0) {
			r=n%10;
			n=n/10;
			sump= (int)(sump + Math.pow(r, digitCount));
			
		}
		if(temp==sump) {
				System.out.println("the give number is armstrong number");
		}
		else {
			System.out.println("the give number is not armstrong number");

		}
		sc.close();
	}

}
