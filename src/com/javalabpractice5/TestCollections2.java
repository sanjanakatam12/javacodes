package com.javalabpractice5;
//remove duplicate elements

//input - [10,20,10,30,40,20,60,10]
//output-[10,20,30,40,60]

import java.util.ArrayList;

public class TestCollections2 {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(10);
		list.add(30);
		list.add(40);
		list.add(20);
		list.add(60);
		list.add(10);

		ArrayList<Integer> result = new ArrayList<>();

		for (int num : list) {
			if (!(result.contains(num))) {
				result.add(num);
			}
		}
		System.out.println(result);

	}

}
