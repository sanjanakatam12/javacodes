package com.javalabpractice;

public class Employee1 {
	
	int empid;
	String ename;
	double esal;
	
	Employee1(int empid ,String ename){
		
		this.empid = empid;
		this.ename = ename;
		
	}
	Employee1(int id, String name, double sal){
		empid = id;
		ename = name;
		esal = sal;
		
		}

	public static void main(String[] args) {
		
		System.out.println("main method started!");
		Employee1 e1 = new Employee1(12,"sanjana");
		Employee1 e2 = new Employee1(12,"sanjana",30000);

		e1.display();
		e2.display();
		
		System.out.println("main method ended!");

	}
	 void display(){
		 
		 System.out.println(empid);
		 System.out.println(ename);
		 System.out.println(esal);
		
	}

}
