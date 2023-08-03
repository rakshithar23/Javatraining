package com.lumen.objbasics;	

	public class Book {
		String title;
		String author;
		double price;

	     public void showbook() {

	       System.out.println("Title name"+title);

	         System.out.println("author name"+author);

	         System.out.println("price is :"+price);
	     }

	  public double getDiscountedPrice(int i) {

	        return price-i;

	    }

	 

	}


