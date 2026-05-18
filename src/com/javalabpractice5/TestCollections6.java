package com.javalabpractice5;

import java.util.HashSet;

public class TestCollections6 {

	public static void main(String[] args) {
		HashSet <Integer>set1=new HashSet<>();
		set1.add(10);
		set1.add(20);
		set1.add(30);
		set1.add(40);
		set1.add(50);
		System.out.println(set1);
		
		
		HashSet <Integer>set2=new HashSet<>();
		set2.add(60);
		set2.add(70);
		set2.add(80);
		set2.add(90);
		set2.add(100);
		System.out.println(set2);
		
		set1.removeAll(set2);
		
		System.out.println(set1);
		
		
		
		

	}

}
