package com.lumen.exception;

public class Multicatch {
	public static void main(String[] args) {
		try {
			System.out.println("Welcome");
		String value = args[0];
		System.out.println("Value "+value);
		int num = Integer.parseInt(value);
		System.out.println("Number " +num);
		int result = 100/num;
		System.out.println(result);
		
		int [] nums = null;
		System.out.println(nums[0]);
		
		
	} catch (ArrayIndexOutOfBoundsException | ArithmeticException | NumberFormatException e) {
		System.out.println(e.getMessage());
		System.out.println("dont enter 0");
		
	} catch(RuntimeException e) {
		System.out.println(e.getMessage());
	}
	catch (Exception e) {
		System.out.println(e.getMessage());
	}
		
		

	System.out.println("completed");	
	}
}
	

	

	


