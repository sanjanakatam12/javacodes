package com.javalabpractice;

public class Arrays8 {

	public static void main(String[] args) {
		
		int[][]arr= {{1,2,3},{4,5,6},{7,8,9}};
		
		
				

	}
	
	static void reverseofArray(int arr[]) {
		
		int temp = 0;
		int start=0;
		int end=arr.length-1;

		while (start < end) {
			temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
	}

}
