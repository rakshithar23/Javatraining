package com.lumen.streams;

import java.util.Arrays;
import java.util.Optional;

public class OptionDemo {
	public static void main(String[] args) {
		Optional<String> courseOptional = Arrays.asList("Java","Angular","Node","Spring")
				.stream()
				.filter(str->str.length()>10)
				.findFirst();
		
		if(courseOptional.isPresent())
			System.out.println(courseOptional.get());
		
		if(!courseOptional.isEmpty())
			System.out.println(courseOptional.get());
		
		courseOptional.ifPresent (System.out::println);
		
		String cname = Arrays.asList("Java","Angular","Node","Spring")
				.stream()
				.filter(str->str.length()>1)
				.findFirst()
				.orElse("No course");
		System.out.println(cname);
		
		String ccname = Arrays.asList("Java","Angular","Node","Spring")
				.stream()
				.filter(str->str.length()>1)
				.findFirst()
				.orElseGet(()->"hello");
		System.out.println(ccname);	
		
		String coname = Arrays.asList("Java","Angular","Node","Spring")
				.stream()
				.filter(str->str.length()>10)
				.findFirst()
				.orElseThrow(()-> new RuntimeException("no value present"));
		System.out.println(coname);
				
				
	}

}
