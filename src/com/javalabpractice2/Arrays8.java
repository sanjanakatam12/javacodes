package com.javalabpractice2;

public class Arrays8 {

	public static void main(String[] args) {
		
		int [] [] arr= {{1,2},{3,4}};
		
		int rows=arr.length;
		int cols=arr[0].length;
		
		for(int i =0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
				
				System.out.print(arr[j][i] + " ");
			}
			System.out.println(); 
			
		}

	}

}
