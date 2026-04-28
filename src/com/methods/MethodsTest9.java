package com.methods;

public class MethodsTest9 {
	class Student {
		int sid;
		String sname;
		Address address;
	}

	class Address {
		String street;
		String city;
	}

	abstract class Hello {
		abstract void method1();
	}

	public static void main(String[] args) {
		System.out.println("main method started ");
		MethodsTest9 t = new MethodsTest9();
		Student s1 = t.getStudent();
		System.out.println(s1.sid);
		System.out.println(s1.sname);
//			System.out.println(s1.address);
		Address a1 = t.getAddress();
		System.out.println(a1.city);
		System.out.println(a1.street);
	}

	// factory methods
	Student getStudent() {
		Student s = new Student();
		s.sid = 101;
		s.sname = "Srikanth";
		return s;
	}

	Address getAddress() {
		Address a = new Address();
		a.street = "KPHB";
		a.city = "Hyderabad";
		return a;
	}
}
