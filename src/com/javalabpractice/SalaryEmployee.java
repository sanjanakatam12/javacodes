package com.javalabpractice;

public class SalaryEmployee {

	public static void main(String[] args) {
		int basicsalary = 300000;
		int bonuse = 100000;
		int deduction = 50000;
		int workingdays = 30;
		int workeddays = 26;

		int grossSalary = basicsalary + bonuse;
		System.out.println("GrossSalary:" + grossSalary);

		int netsalary = grossSalary - deduction;
		System.out.println("netsalary:" + netsalary);

		int perdaysalary = basicsalary / workingdays;
		System.out.println("perdaysalary:" + perdaysalary);

		int earnedsalary = perdaysalary * workeddays;
		System.out.println("earnedsalary:" + earnedsalary);

		int remainingdays = workingdays % workeddays;
		System.out.println("remainingdays:" + remainingdays);

	}

}
