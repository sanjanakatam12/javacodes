package com.methods;
//Assignment1

//with return type with arguments
//area of circle = pi*radius*radius
//area of triangle= 0.5*base*height
//area of rectangle= height*breadth
//area of square= side*side
import java.util.Scanner;

public class MethodsTest6 {

	static double areaofcircle(double r) {
		double areaofcir = Math.PI * r * r;
		System.out.println("area of circle:" + areaofcir);

		return areaofcir;

	}

	static double areaoftriangle(double base, double height) {
		double areaoftri = 0.5 * base * height;
		System.out.println("area of triangle:" + areaoftri);
		return areaoftri;

	}

	static double areaofrectangle(double length, double breadth) {
		double areaofrec = length * breadth;
		System.out.println("area of rectangle:" + areaofrec);
		return areaofrec;

	}

	static double areaofsquare(double side) {
		double areaofsqu = side * side;
		System.out.println("area of square: " + areaofsqu);
		return areaofsqu;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("enter the value of base:");
		double b = sc.nextDouble();
		System.out.println("enter the value of height:");
		double h = sc.nextDouble();
		System.out.println("enter the value of radius:");
		double r = sc.nextDouble();
		System.out.println("enter the value of length:");
		double l = sc.nextDouble();
		System.out.println("enter the value of breadth:");
		double br = sc.nextDouble();
		System.out.println("enter the value of side:");
		double s = sc.nextDouble();

		areaofcircle(r);
		areaoftriangle(b, h);
		areaofrectangle(l, br);
		areaofsquare(s);
		sc.close();

	}

	}

	