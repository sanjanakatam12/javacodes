package com.javalabpractice2;

public class Student {
	
	private int id;
	private String name;
	private String branch;
	
//	Student(int id ,String name, String branch) {
//		this.id=id;
//		this.name=name;
//		this.branch=branch;
//		
//	}
	
	void setId(int id){
		this.id=id;
		
	}
	int getId() {
		return id;
		
	}
	void setName(String name) {
		this.name=name;
		
	}
	String getName() {
		return name;
	}
	void setBranch(String branch) {
		this.branch=branch;
		
	}
	String getBranch() {
		return branch;
	}
	
	

}
