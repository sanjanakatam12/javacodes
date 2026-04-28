package com.javalabpractiece3;

public class Vechilemain {

	public static void main(String[] args) {
		
		Vechile v1 = new Car("kia");
		Vechile v2=new Bike("honda");
		
		v1.start();
		v1.stop();
		
		
		v2.start();
		v2.stop();

	}

}
