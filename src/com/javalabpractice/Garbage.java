package com.javalabpractice;

public class Garbage {

				public void finalize() {
					System.out.println("object destroyed");
				}
				
			public static void main(String[] args) {
				
				Garbage t1 = new Garbage();
				Garbage t2 = new Garbage();
				Garbage t3 = new Garbage();
			
				t2=null;
				t1=t2;
			new Garbage();
			
			System.gc();
				System.out.println(t1);
				System.out.println(t2);
				System.out.println(t3);
				
				
			}

		
	}


