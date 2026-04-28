package com.vairables;

public class Employee1 {
	int empid;
	double empsal;
	static String orgname = "vcube";
	static int orgid = 123;

	public static void main(String[] args) {
		var id = 101;
		var name = "srikanth";
		System.out.println(id);
		System.out.println(name);
		//ce:the local vairable a may not have been initialized
		// System.out.println(a);
		//local vairable
		//primitive +local
		int orgid = 666;
		// object +primitive
		String orgname = "vss";
		// illegal modifier for parameter namw; only final is permitted

		Employee1 e1 = new Employee1();
		System.out.println(e1.empid);
		System.out.println(e1.empsal);
		System.out.println(orgname);
		System.out.println(orgid);

		System.out.println(Employee1.orgid);
		System.out.println(Employee1.orgname);

	}

}
