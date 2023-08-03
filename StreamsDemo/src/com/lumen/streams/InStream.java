package com.lumen.streams;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class InStream {
	public static void main(String[] args) {
//		Consumer<String> consumer = (str)->
		
		List<String> courses = Arrays.asList("java","Angular","Node","Spring","Css","React");
		Iterator<String> iterator = courses.stream()
				                    .filter(str->str.length()>4)
				                    .skip(2)
				                    .iterator();
		while(iterator.hasNext()) {
			String cname = iterator.next();
			System.out.println(cname);
			
		}
		
		System.out.println();
		courses.stream()
		.filter(str->str.length()>4)
		.distinct()
		.limit(2)
		.forEach(str->System.out.println(str.toUpperCase()));
		
		System.out.println();
		List<Integer> ncourses = courses.stream()
				.sorted()
				.map(str->str.length())
				.filter(num->num>5)
				.collect(Collectors.toList());
		
		ncourses.forEach(num->System.out.println(num));
		
		
				
		
		
	}
	

}
