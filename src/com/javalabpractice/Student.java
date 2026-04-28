package com.javalabpractice;

public class Student {

	int sid;
	String sname;
	int sage;

	Student() {
		System.out.println("no arg constructor called!");
		sid = 12;
		sname = "sanjana";
		sage = 22;
	}

	Student(int sid) {
		this();
		System.out.println("1 arg constructor called");
		this.sid = sid;
	}

	Student(int sid, String sname) {
		this(sid);
		System.out.println("2 arg constructor called");
		this.sid = sid;
		this.sname = sname;
	}

	Student(int sid, String sname, int sage) {
		this(sid, sname);
		System.out.println("3 arg constructor called");
		this.sid = sid;
		this.sname = sname;
		this.sage = sage;

	}

	public static void main(String[] args) {
		System.out.println("main method started!");

		Student s = new Student();
		s.show();
		Student s1 = new Student(19);
		s1.show();
		Student s2 = new Student(20, "sirisha");
		s2.show();
		Student s3 = new Student(21, "renu", 23);
		s3.show();

	}

	void show() {
		System.out.println("*********************************");
		System.out.println("student Id:" + sid);
		System.out.println("student Name:" + sname);
		System.out.println("student Age:" + sage);
		System.out.println("*********************************");

	}

}
