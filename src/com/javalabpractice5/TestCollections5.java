package com.javalabpractice5;

import java.util.HashSet;
import java.util.Set;

public class TestCollections5 {

	public static void main(String[] args) {
		
		Set<Integer> set1=new HashSet<>();
		set1.add(10);
		set1.add(20);
		set1.add(30);
		set1.add(40);
		set1.add(50);
		System.out.println(set1);
		
		set1.remove(10);
		System.out.println(set1);

	}

}
