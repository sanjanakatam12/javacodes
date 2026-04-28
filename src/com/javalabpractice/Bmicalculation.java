package com.javalabpractice;

public class Bmicalculation {

	public static void main(String[] args) {

		double weight = 65.23;
		double height = 5.67;

		double BMI = (weight / height * height);

		int BMI1 = (int) BMI;

		System.out.println(BMI);
		System.out.println(BMI1);

	}

}
