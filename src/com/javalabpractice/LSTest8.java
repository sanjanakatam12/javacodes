package com.javalabpractice;

import java.util.Scanner;

public class LSTest8 {

	public static void main(String[] args) {
		System.out.println("main method started!");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int r;
		String s = " ";
		
		while(n!=0) {
			r=n%10;
			if(r!=0) {
				s=r+s;
			}
			n=n/10;
		}
		
		
		
		System.out.println("result of number:" + s);
		sc.close();
		

	}

}
