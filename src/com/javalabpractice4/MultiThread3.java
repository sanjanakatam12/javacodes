package com.javalabpractice4;

class Thread1 extends Thread {
	public void run() {
		for (int i = 0; i <= 5; i++) {
//			System.out.println(i + " run");
			try {
				System.out.println(i + " run");

				Thread.sleep(5000);
				
			} catch (InterruptedException e) {
//			e.printStackTrace();
				System.err.println(e.getMessage());
			}

		}
	}
}

public class MultiThread3 {

	public static void main(String[] args) {
		System.out.println("main method started");
		Thread1 t1 = new Thread1();
		t1.start();
		t1.interrupt();

//		for (int i = 0; i <= 5; i++) {
//			System.out.println(i + " main");
//		}

	}

}
