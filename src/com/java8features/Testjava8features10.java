package com.java8features;

interface In10 {
	void play();

	void show();
}


public class Testjava8features10 {

	public static void main(String[] args) {
		In10 i = new In10() {
			@Override
			public void play() {
				System.out.println("Play Cricket !");
			}

			@Override
			public void show() {
				System.out.println("Show method called ");

			}
		};

		i.play();
		i.show();

	}

}
