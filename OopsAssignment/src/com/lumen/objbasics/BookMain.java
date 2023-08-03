package com.lumen.objbasics;

public class BookMain {
public static void main(String[] args) {
		
		Book book=new Book();
		book.title="Maths";
		book.author="Arham";
		book.price=1000;
		book.showbook();
		int amount=(int) book.getDiscountedPrice(500);
		System.out.println(amount);
		

	}

}


