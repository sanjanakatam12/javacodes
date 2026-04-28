package com.javalabpractice2;

public class Arrays3 {

	public static void main(String[] args) {
		
		int[] []arr= {{1,1,0},{1,1,1},{0,1,1}};
		
		int rows=arr.length;
		int cols=arr[0].length;
		
		boolean[] zerorow=new boolean[rows];
		boolean[] zerocol=new boolean[cols];
		
		for(int i = 0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
				if(arr[i][j]==0) {
				zerorow[i]=true;
				zerocol[j]=true;
				}
			}
		}
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
				if(zerorow[i]||zerocol[j]) {
					arr[i][j]=0;
				}
				
			}
		}
		 System.out.println("Output Matrix:");
	        for (int i = 0; i < rows; i++) {
	            for (int j = 0; j < cols; j++) {
	                System.out.print(arr[i][j] + " ");
	            }
	            System.out.println();
	        }


		

	}

}
