package com.javalabpractice;

//write a java program take two methods with same name with different arguments.
//if i sent integer value into the method then the method should
//return the related character.
//if i sent a character into method then the method should return its ascii number.

import java.util.Scanner;

public class Methodtest2 {

	static void welcome(int a) {
		char ch = (char) a;
		System.out.println("Character is: " + ch);
	}

	static void welcome(char c) {
		int ascii = (int) c;
		System.out.println("ASCII value is: " + ascii);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter an integer: ");
		int num = sc.nextInt();
		welcome(num);

		System.out.print("Enter a character: ");
		char ch = sc.next().charAt(0);
		welcome(ch);

		sc.close();

	}

}
