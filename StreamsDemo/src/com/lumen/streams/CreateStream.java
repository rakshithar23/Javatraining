package com.lumen.streams;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class CreateStream {
	public static void main(String[] args) {
		String[] names = new String[] {"Ram","Sri","Sanjana","Rak","Satish"};
		Stream.of(names).forEach(name-> System.out.println(name));
		
		Arrays.stream(names).forEach(name-> System.out.println(name));
		
		int[] nums = {10,390,40,38,50};
		int sum = Arrays.stream(nums, 1, 4)
				.filter(num->num%2==0)
				.sum();
		System.out.println(sum);
		
		IntStream stream = Arrays.stream(nums, 1, 5);
				double sumresult =stream.mapToObj(num->String.valueOf(num))
						.mapToDouble(str->Double.parseDouble(str))
						.sum();
						System.out.println(sumresult);
						
		Arrays.stream(nums, 1, 5)
		.map(num->(int)Math.pow(num,  2))
		.forEach(n -> System.out.println(n));
		
		Stream.generate(()->"Hello").limit(5).forEach(System.out::println);
		
		
	}
}
