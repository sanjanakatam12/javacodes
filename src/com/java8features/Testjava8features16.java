package com.java8features;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

class Student {
	String name;
	double marks;

	public Student(String name, double marks) {
		super();
		this.name = name;
		this.marks = marks;
	}

}


public class Testjava8features16 {

	public static void main(String[] args) {
		
		System.out.println("main method strated ");

		Function<Student, String> f1 = (st) -> {
			String grade = "";

			if (st.marks > 100 || st.marks < 0) {
				grade = "Invalid";
			} else if (st.marks >= 90.0) {
				grade = "A";
			} else if (st.marks >= 80.0) {
				grade = "B";
			} else if (st.marks >= 70.0) {
				grade = "C";
			} else if (st.marks >= 60.0) {
				grade = "D";
			} else if (st.marks >= 35) {
				grade = "P";
			} else {
				grade = "F";
			}

			return grade;
		};

		Student s1 = new Student("Abhishek", 80);
		Student s2 = new Student("Tilak", 90);
		Student s3 = new Student("Sky", 60);
		Student s4 = new Student("Vaibhav", 100);

//		Student[] studentList = new Student[5];
//		studentList[0] = s1;
//		studentList[1] = s2;
//		studentList[2] = s3;
//		studentList[3] = s4;

		List<Student> studentList = new ArrayList<>();
		studentList.add(s1);
		studentList.add(s2);
		studentList.add(s3);
		studentList.add(s4);

		Predicate<Student> p1 = (st) -> st.marks >= 90;
		Consumer<Student> c1 = (st) -> {
			System.out.println("name of the Stdudent : " + st.name);
			System.out.println("Marks of the Stduent: " + st.marks);
			System.out.println("Grade of the Stduent: " + f1.apply(st));
			System.out.println("*****************************");
		};

		for (Student student : studentList) {
			if (p1.test(student)) {
				c1.accept(student);
			}
		}
		
		

	}

}
