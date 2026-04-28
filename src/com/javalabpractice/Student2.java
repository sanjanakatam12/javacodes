package com.javalabpractice;

public class Student2 {
	
	int sid;
	String sname;
	String sbranch;
	
	Student2(int sid, String sname, String sbranch){
		System.out.println("parametraize constructor called");
		this.sid=sid;
		this.sname=sname;
		this.sbranch=sbranch;
		
	}
	Student2(Student2 s, String sname){
		System.out.println("copy constructor is called");
		this.sid=s.sid+1;
		this.sname=sname;
		this.sbranch=s.sbranch;
	}
	
	public static void main(String[] args) {
		Student2 s = new Student2(101,"sanjana","ece");
		s.display();
		Student2 s1= new Student2(s,"Amulya");
		s1.display();
		Student2 s2 =new Student2(s1,"sirisha");
		s2.display();
		Student2 s3 =new Student2(s2,"Anies");
		s3.display();
				
	}
	void display() {
		System.out.println("student Id:" + sid);
		System.out.println("student Name:" + sname);
		System.out.println("student Branch:" + sbranch);

	}

}
