package com.constructor;

public class Student {
	int sid;
	String sname;

	Student() {
		System.out.println("no arg constructor called!");
		sid = 123;
		sname = "sanjana";
	}
	
	Student(int sid, String sname){
		System.out.println("parameterized constructor called!");
	this.sid=sid;
	this.sname=sname;
		
	}

	public static void main(String[] args) {
		System.out.println("main method started!!");

		Student s1 = new Student();
		System.out.println(s1.sid);
		System.out.println(s1.sname);
		
		Student s2 = new Student();
		System.out.println(s2.sid);
		System.out.println(s2.sname);

		Student s3 = new Student(18,"virat");
		System.out.println(s3.sid);
		System.out.println(s3.sname);

		System.out.println("main method ended!!");

	}

}
