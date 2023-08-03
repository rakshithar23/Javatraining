package com.lumen.streams;

import java.util.Arrays;
import java.util.stream.Stream;

public class FlatDemo {
	public static void main(String[] args) {
	String[] name = {"Rak","Shivam","Yash","Saba","Venk"};
	Arrays.stream(name).forEach(System.out::println);
	
	String[][] names = new String[][] {{"Rak","Sham"},{"Ram","jhon"},{"Lak","Shan"}};
	Stream<String[]> streamTwo = Arrays.stream(names);
	
	Stream<String> streamo = streamTwo.flatMap(onearr->Arrays.stream(onearr));
	
	streamo.mapToInt(String::length).forEach(System.out::println);
	
	Arrays.stream(names)
	.flatMap(oneArr->Arrays.stream(oneArr))
	.map(String::toUpperCase)
	.forEach(System.out::println);
	
	
	
	
	
}
}
