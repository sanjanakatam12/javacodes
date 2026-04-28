package com.javalabpractice;

import java.util.Scanner;

//fabnocci series

public class LSTest6 {

	public static void main(String[] args) {
		System.out.println("main method started:");
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number:");
		int n=sc.nextInt();
		
		int n1=0;
		int n2=1;
		
		int n3=0;
		System.out.print(n1 + " " + n2);
		
		for(int i=1;i<=n;i++) {
			n3=n1+n2;
			System.out.print(" " +n3);
			
			n1=n2;
			n2=n3;
			
		}
		
		sc.close();

	}

}
