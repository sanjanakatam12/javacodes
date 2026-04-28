package com.javalabpractice;

public class Employee {
	int id = 19;
	String name = "sanjana";
	int salary = 32000;

	{

		salary = salary + (salary * 10) / 100;
	}

	public static void main(String[] args) {

		Employee e = new Employee();

		System.out.println("empid:" + e.id);
		System.out.println("empname:" + e.name);
		System.out.println("empsalary:" + e.salary);

	}

}
