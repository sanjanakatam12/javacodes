package com.javalabpractice4;
// reverse of sentence not char

public class TestString7 {

	public static void main(String[] args) {
		
		String name="i love java";
		String []words=name.split(" ");
		
		for(int i=words.length-1;i>=0;i--) {
			System.out.print(words[i] + " ");
		}

	}

}
