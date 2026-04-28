package com.javalabpractiece3;

import java.util.Scanner;

public class Mainapp {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the transaction ID");
		String transid=sc.nextLine();
		
		System.out.println("enter the amount");
		int amount =sc.nextInt();
		
//		int options;
//		do {
		
		System.out.println("******************");
		
		System.out.println("payment options");
		
		System.out.println("1.Upipayment");
		System.out.println("2.creditcard");
		
		System.out.println("enter the options");
		int options1 =sc.nextInt();
		
		switch(options1) {
		case 1:
			Payment p1=new Upipayment();
			p1.payBill(50000.000);
			break;
		case 2:
			Payment p2 =new Creditcard();
			p2.payBill(100000.00);
			break;
			
		default :
				System.out.println("invalid option");
		}
//		} while(options !=3);
		sc.close();
		

	}

}
