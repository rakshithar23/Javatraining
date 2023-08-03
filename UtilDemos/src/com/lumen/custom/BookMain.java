package com.lumen.custom;

import java.text.CollationElementIterator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;


public class BookMain {
	public static void main(String[] args) {
		Book book1 = new Book("one","Rak",345.0);
		Book book2 = new Book("two","lak",356.0);
		Book book3 = new Book("three","nan",385.0);
		
		List<Book> booklist = new ArrayList<>();
		
		booklist.add(book1);
		booklist.add(book1);
		booklist.add(book1);
		
		
		Iterator<Book> iterator=booklist.iterator();
		while(iterator.hasNext()) {
			Book name = iterator.next();
			System.out.println(name);
			
		}
		List<Book> booksByAuthor = new ArrayList<Book>();
		String author = "kathy";
		for(Book book : booklist) {
			System.out.println(book);
			if(book.getAuthor().equals("kathy"));
			booksByAuthor.add(book);
			
			
		}
		
		System.out.println("Before Sorting");
		for(Book book : booklist) {
			System.out.println(book);
		}
		Collections.sort(booklist);
		for(Book book : booklist) {
			System.out.println(book);
		}
		
		System.out.println("After Sorting");
		
		
		
	Iterator<Book> iterator2=booksByAuthor.iterator();
	while(iterator2.hasNext()) {
		Book name = iterator2.next();
		System.out.println(name);
		
	}
}
}
