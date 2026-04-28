package com.operators;

//Assignment operators +=,-=,*=,/=,%=
public class Operators2 {

	public static void main(String[] args) {
		System.out.println("main method started");

		int a = 10;
		int result = 0;

		result = result + a;
		result=result+5;

		// result =result + 4.5;
		result += 4.5;//19
		// result = result - 4.5;
		result -= 4.5;//14
		// result = result * 4.5;
		result *= 3.5;//49
		// result=result / 4.5;
		result /= 3.5;
		// result=result % 4.5;
		result %= 2.5;

		System.out.println( result);
		System.out.println("main method ended");

	}

}
