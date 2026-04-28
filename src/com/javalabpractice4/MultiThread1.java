package com.javalabpractice4;

class Threadnums extends Thread {

	public void run() {

		for (int i = 0; i <= 10; i++) {
			System.out.println(i);
		}

	}
}

class Threadalpha extends Thread{
	public void run() {
	for(char x='a';x<='j';x++) {
		System.out.println(x);
	}
	
   }
}

public class MultiThread1 {

	public static void main(String[] args) {
		Threadnums n1 =new Threadnums();
		Threadalpha a1 =new Threadalpha();
		n1.start();
		a1.start();


	}

}
