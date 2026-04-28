package com.javalabpractice;
// find the object count in a class without using blocks

public class Count {
	
	 static int count;
	
	Count(){
		
		count++;
	}

	public static void main(String[] args) {
		System.out.println("main method started!!");
		//Count c = new Count();
		//Count c1= new Count();
		//Count c2 = new Count();
		//Count c3 = new Count();
		//Count c4 = new Count();
		
		new Count();
		new Count();
		new Count();
		new Count();
		new Count();

		System.out.println(count);
			
	}

}
