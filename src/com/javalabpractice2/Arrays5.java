package com.javalabpractice2;

public class Arrays5 {

	public static void main(String[] args) {
		
		int [] arr= {13,2,8,4,5,1};
		
		int n=arr.length;
		
		int maxoflength=arr[n-1];
		System.out.println("leader of the array" + maxoflength + "");
		
		for(int i =n-2;i>=0;i--) {
			if(arr[i]>maxoflength) {
				maxoflength=arr[i];
				System.out.println(maxoflength + " ");
			}
			
		}

	}

}
