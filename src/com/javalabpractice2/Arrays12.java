package com.javalabpractice2;


public class Arrays12 {

	public static void main(String[] args) {
		int [] arr= {10,1,9,6,13,27,96};
		
		int maxProfit = 0;
		int buyDay = 0;
		int sellDay = 0;
		for(int i=0;i<arr.length;i++) {
			int dmax=0;
			for(int j = i+1;j<arr.length;j++) {
				int d=0;
				if(arr[j]>arr[i]) {
					d=arr[j]-arr[i];
					
				}
				if(d>dmax) {
					dmax=d;
					sellDay=j+1;
				}
				if(dmax>maxProfit) {
					maxProfit=dmax;
					buyDay=i+1;
					
				}
				
			}
		}
		System.out.println("buy day:" +buyDay );
		System.out.println("sell day:" +sellDay );

		
		

	}

}
