package com.javalabpractice5;

import java.util.ArrayList;
import java.util.Collection;

public class TestCollections1 {

	public static void main(String[] args) {
		Collection<Integer> list1=new ArrayList<>();
		list1.add(20);
		list1.add(30);
		list1.add(40);
		list1.add(50);
		
		Collection<Integer> list2=new ArrayList<>();
		list2.add(20);
		list2.add(40);
		list2.add(60);
		
		Collection<Integer> list3=new ArrayList<>();
		list3.add(20);
		list3.add(40);
		list3.add(30);
		
		Collection<Integer> result=new ArrayList<>(list1);
		
		result.retainAll(list2);
		result.retainAll(list3);
		
		if(result.isEmpty()) {
			System.out.println("no common elements");
			
		}else {
			System.out.println("elements" + result);
		}
		System.out.println(list1);
		System.out.println(list2);
		System.out.println(list3);

		

	}

}
