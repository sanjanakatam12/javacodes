package com.javalabpractice2;

public class Arrays16 {

	public static void main(String[] args) {
		int [] arr= {2,3,1,5,7,8,4};
		
		int n=arr.length;
		int max = 0;
		
		for(int i=0;i<n;i++) {
			int height=arr[i];
			int left=i;
			int right=i;
			
			while(left>0 && arr[left-1]>=height) {
				left--;
				
			}
			while(right<n-1 && arr[right+1]<=height) {
				right++;
				
			}
			
		}

	}

}
