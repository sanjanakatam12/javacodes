package com.accessmodifier2;

import com.accessmodifier1.Testaccess1;

public class Testaccess3 extends Testaccess1 {

	public static void main(String[] args) {
		System.out.println("main method started ");

//		TestAccessDemo1 cannot be resolved to a type, if the class is default, 
//		we cannot access outside of the packages/.

//		If the class is public but the data is default we cannot access outside of the packages.
		Testaccess1 t1 = new Testaccess1();
//		System.out.println(t1.a2);
//		System.out.println(t1.name2);
//		t1.method2();

		// Note : If you want to access the data members outside of the packages, data
		// must be public
		System.out.println(t1.a3);
		System.out.println(t1.name3);
		t1.method3();

		// Accessing the protected data members outside of the classes of different
		// packages is not possible even though its a sub class of your class.
//		System.out.println(t1.a4);
//		System.out.println(t1.name4);
//		t1.method4();

//		 Accessing the protected data members outside of the packages of sub classes with sub class object reference only.
		Testaccess3 t3 = new Testaccess3();
		System.out.println(t3.a4);
		System.out.println(t3.name4);
		t3.method4();

		System.out.println("main method ended ");


	}

}
