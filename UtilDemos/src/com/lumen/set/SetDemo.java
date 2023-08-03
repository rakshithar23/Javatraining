package com.lumen.set;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {
	public static void main(String[] args) {
		Set<String> hashset = new TreeSet<>();	
		
		hashset.add("Apple");
		hashset.add("Orange");
		hashset.add("bannana");
		hashset.add("Kiwi");
		hashset.add("100");
		hashset.add("Apple");
		System.out.println(hashset);
		System.out.println(hashset);
		for (String element : hashset) {
			System.out.println(element);
		}
		
		
	}

}
