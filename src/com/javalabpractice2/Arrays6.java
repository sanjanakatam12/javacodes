package com.javalabpractice2;

public class Arrays6 {

	public static void main(String[] args) {
		
		int [] arr= {13,2,8,4,5,1};
		int n=arr.length;
		for (int i = 0; i < n; i++) {
            boolean isLeader = true;

            for (int j = i + 1; j < n; j++) {
                if (arr[j] > arr[i]) {
                    isLeader = false;
                    break;
                }
            }

            if (isLeader) {
                System.out.print(arr[i] + " ");
            }
        }

	}

}
