package com.javalabpractice2;

public class Arrays10 {

	public static void main(String[] args) {
		
		int [][] arr= {{1,0,0},{0,1,0},{0,0,1}};
		int n = arr.length;
        int[][] result = new int[n][n];
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    result[i][j] += arr[i][k] * arr[k][j];
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
		

	}

}
