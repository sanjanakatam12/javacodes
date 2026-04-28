package com.javalabpractice4;

import java.util.HashSet;

public class TestString8 {

	public static void main(String[] args) {
		
		String s="abcacbbd";
		HashSet<Character>set=new HashSet<>();
		String longest="";
		int left=0;
		for(int i=0;i<s.length();i++) {
			while(set.contains(s.charAt(i))) {
				set.remove(s.charAt(left));
				left++;
			}
			set.add(s.charAt(i));
			if(i-left+1>longest.length()) {
				longest=s.substring(left,i+1);
				
			}
//			System.out.println(longest); 
		}
		System.out.println(longest); 
		
		

	}

}
