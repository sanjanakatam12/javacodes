package com.javalabpractice2;

public class Arrays1 {

	public static void main(String[] args) {

		int[] arr = { 2, 4, 6,2, 8, 10,2 };
		boolean rep[]=new boolean[arr.length];
		int targetSum = 12;

		System.out.println("Pairs:");

		boolean status = false;

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] + arr[j] == targetSum && !rep[i] && !rep[j]) {
					System.out.println(arr[i] + " + " + arr[j] + " = " + targetSum);
					rep[j]=true;
					status = true;
				}
			}
		}
		if(!status) {
			System.out.println("no pairs found");
		}

		
	}

}
