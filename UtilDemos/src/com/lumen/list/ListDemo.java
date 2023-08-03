package com.lumen.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;
import java.util.Iterator;


public class ListDemo {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		System.out.println(list.size());
		list.add("java");
		list.add("100");
		list.add("100.9");
		list.add("Spring");
		list.add("angular");
		list.add("maven");
		list.add(1,"Helen");
		System.out.println(list);
		list.set(2,"priya");
		System.out.println(list.size());
		
		Iterator<String> iterator=list.iterator();
		while(iterator.hasNext()) {
			String name = iterator.next();
			System.out.println(name.toLowerCase());
			
		}
		Collections.sort(list);
		System.out.println(list);
		
		for(String name:list)
			System.out.println(name.toUpperCase());
		
		System.out.println(list.size());
		list.set(1, "Lucky");
		list.add(2,"Buddy");
		System.out.println(list.get(2));
		
		System.out.println("Reverse");
		ListIterator<String> listIerator = list.listIterator(list.size());
		while(listIerator.hasPrevious()) {
			String name = listIerator.previous();
		System.out.println(name.toUpperCase());
			
		
		}
		
		
	}
	
	
	

}
