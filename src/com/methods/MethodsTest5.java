package com.methods;
//3) with return type + no arguments

public class MethodsTest5 {
	
	double getSalaryInfo() {
		double salary = 100000.00;
		return salary;
	}

	double getBonusInfo() {

		double bonus = 20000.00;
		return bonus;
	}

	public static void main(String[] args) {
		System.out.println("main method started ");
		MethodsTest5 t = new MethodsTest5();
		double sal = t.getSalaryInfo();
		double bonus = t.getBonusInfo();
		System.out.println("Total Salary = " + (sal + bonus));
		System.out.println("main method ended");
	}	
}
