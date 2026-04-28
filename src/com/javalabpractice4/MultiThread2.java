package com.javalabpractice4;

class TableThread extends Thread {
	int num;

	TableThread(int num) {
		this.num = num;
	}

	public void run() {
		System.out.println("table of" + num + "started");

		for (int i = 1; i <= 10; i++) {
			System.out.println(num + " X" + i + " =" + (num * i));

		}
		System.out.println(" table of" + num + " \n");
	}


}
public class MultiThread2 {

	public static void main(String[] args) {
		TableThread t1 = new TableThread(2);
		//TableThread1 t2 = new TableThread1(3);
		//TableThread2 t3 = new TableThread2(5);
		TableThread t2 = new TableThread(3);
		TableThread t3 = new TableThread(5);

		t1.start();
		t2.start();
		t3.start();

	}

}

//class TableThread1 extends Thread {
//	int num;
//
//	TableThread1(int num) {
//		this.num = num;
//	}
//
//	public void run() {
//		System.out.println("table of" + num + "started");
//
//		for (int i = 1; i <= 10; i++) {
//			System.out.println(num + " X" + i + " =" + (num * i));
//
//		}
//		System.out.println(" table of" + num + " \n");
//	}
//
//}
//class TableThread2 extends Thread {
//	int num;
//
//	TableThread2(int num) {
//		this.num = num;
//	}
//
//	public void run() {
//		System.out.println("table of" + num + "started");
//
//		for (int i = 1; i <= 10; i++) {
//			System.out.println(num + " X" + i + " =" + (num * i));
//
//		}
//		System.out.println(" table of" + num + " \n");
//	}
//
//}

