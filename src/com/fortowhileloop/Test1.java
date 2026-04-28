package com.fortowhileloop;

import java.util.Scanner;
//even number of by using while loop
public class Test1 {

	public static void main(String[] args) {
		System.out.println("main method started");
		Scanner sc= new Scanner(System.in);
		System.out.println("enter a number");
		int n = sc.nextInt();
		
		int i=1;
		while(i<=n) {
			if(i%2==0){
				System.out.print(i + " ");
				
			}
			i++;
		}
		sc.close();
		

	}

}
