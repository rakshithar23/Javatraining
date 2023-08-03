package com.lumen.exception;

public class MultipleCatch {
	public static void main(String[] args) {
		try {
			System.out.println("Welcome");
		String value = args[0];
		System.out.println("Value "+value);
		int num = Integer.parseInt(value);
		System.out.println("Number " +num);
		int result = 100/num;
		System.out.println(result);
	} catch (ArrayIndexOutOfBoundsException e) {
		System.out.println(e.getMessage());
		System.out.println("please enter value");
		
	} catch(ArithmeticException e) {
		System.out.println(e.getMessage());
		System.out.println("please enter value");
		
	} catch(NumberFormatException e) {
		System.out.println(e.getMessage());
		System.out.println("dont enter 0");
		
		
		e.printStackTrace();
		System.out.println(e.getMessage());
	}
	
	System.out.println("completed");	
	}
	

	

	}


