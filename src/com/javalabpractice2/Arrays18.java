package com.javalabpractice2;

public class Arrays18 {

	public static void main(String[] args) {
		
		int [] arr= {1,2,-1,3,-9,7,-3,6,-5,-9};
		
		int [] result=new int[arr.length];
		
		int positiveIndex=0;
		int negativeIndex=1;
		
		for(int i=0;i<arr.length;i++) {
			
			if(arr[i]>=0 && positiveIndex<arr.length) {
				result[positiveIndex]=arr[i];
				positiveIndex +=2;
			}
			else if(arr[i]<0 && negativeIndex<arr.length) {
				result[negativeIndex]=arr[i];
				negativeIndex +=2;
			}
			
			
		}
		for(int i=0;i<result.length;i++) {
		System.out.print(result[i] + " ");
		
		}

	}

}
