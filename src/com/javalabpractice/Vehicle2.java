package com.javalabpractice;

public class Vehicle2 {

	String brand;

	Vehicle2(String brand) {
		System.out.println("vehicle constructor called");
		this.brand = brand;

	}

	public static void main(String[] args) {
		System.out.println("main method started from vehicle");

	}

}

class Car extends Vehicle2 {

	int modelYear;

	Car(String brand, int modelYear) {
		super(brand);
		System.out.println("car constructor called");
		this.modelYear = modelYear;

	}

	public static void main(String[] args) {
		System.out.println("main method started from car");

	}

}

class ElectricCar extends Car {
	int batterycapacity;

	ElectricCar(String brand, int modelYear, int batterycapacity) {
		super(brand, modelYear);
		this.batterycapacity = batterycapacity;

	}

	public static void main(String[] args) {
		System.out.println("main method started from ElectricCar");
		ElectricCar ec = new ElectricCar("tesla", 2024, 75);
		ec.display();

	}

	void display() {

		System.out.println("brand of the vehicle:" + brand);
		System.out.println("model of the year:" + modelYear);
		System.out.println("capacity of battery:" + batterycapacity);

	}
}
