package com.lumen.exception;

public class FinallyDemo {
	public static void main(String[] args) {
		try {
			System.out.println("Welcome");
		String value = args[0];
		System.out.println("Value "+value);
		int num = Integer.parseInt(value);
		System.out.println("Number " +num);
		int result = 100/num;
		System.out.println(result);
	} 
		finally {
			System.out.println("closing....");
		}
		
		System.out.println("completed");
	}
	
		
	}


