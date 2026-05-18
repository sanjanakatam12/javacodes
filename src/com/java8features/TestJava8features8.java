package com.java8features;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TestJava8features8 {

	public static void main(String[] args) {
		List<Integer> al = Arrays.asList(10, 25, 4, 6, 8, 2, 3);
		Comparator<Integer> c = (o1, o2) -> (o1 < o2) ? 1 : (o1 > o2) ? -1 : 0;
		Collections.sort(al, c);
		System.out.println(al);

	}

}
