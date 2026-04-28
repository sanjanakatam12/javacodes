package com.javalabpractice;

import java.util.Scanner;

public class ArraysTest1 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("enter a size of array");
		
		int size=sc.nextInt();
		int[] numbers=new int[size];
		
		System.out.println("enter the  array elements");
		
		for(int i =0;i<size;i++) {
			
			numbers[i]=sc.nextInt();
		}
		System.out.println("array of removing elements");
		int[]unique=new int[size];
		int k=0;
		for(int i =0; i<size;i++) {
			boolean status=false;
			
			for(int j=0;j<i;j++) {
				if(numbers[i]==numbers[j]) {
					status = true;
					break;
					
				}
			}
			if (!status) {
				unique[k++]= numbers[i];
				System.out.println(numbers[i] +" ");
			}
		}
			System.out.println();
			System.out.println("even numbers");
			
			for(int i = 0; i < size; i++) {
				if(numbers[i] %2==0) {
					System.out.println(numbers[i] +" ");

				}
			}
			System.out.println("odd numbers");
			for(int i = 0; i < size; i++) {
				if(numbers[i] %2!=0) {
					System.out.println(numbers[i] +" ");

				}
			}
			
		sc.close();

	}

}
