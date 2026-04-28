package com.javalabpractice;
//ASSIGNMENT
public class Employee2 {
	
	int empid;
	String empname;
	double salary;
	String companyname="Techsoft pvt ltd";
	
	Employee2(int empid,String empname,double salary){
		this.empid=empid;
		this.empname=empname;
		this.salary=salary;	
	}
	Employee2(Employee2  e,double salary){
		this.empid=e.empid;
		this.empname=e.empname;
		this.salary=salary;	
	}
	
	public static void main(String[] args) {
		Employee2 e = new Employee2(101,"sanjana", 50000.00);
		e.display();
		Employee2 e1 = new Employee2(e,60000.00);
		e1.display();
		
	}
	void display() {
		System.out.println("employe Id:" + empid);
		System.out.println("employe name:" + empname);
		System.out.println("employe salary:" + salary);
		System.out.println( "name of the company:"+ companyname);
		System.out.println("******************************************");

	}

}
