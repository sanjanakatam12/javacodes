package com.javalabpractice5;

import java.util.HashSet;
import java.util.Set;

public class TestCollections3 {

	public static void main(String[] args) {
		Set<Integer> set1 = new HashSet<>();
		set1.add(20);
		set1.add(30);
		set1.add(40);
		set1.add(60);
		set1.add(70);

		System.out.println(set1);

		Set<Integer> set2 = new HashSet<>();
		set2.add(10);
		set2.add(50);
		set2.add(80);
		set2.add(60);
		set2.add(20);

		System.out.println(set2);

		set1.retainAll(set2);

		System.out.println(set1);

	}

}
