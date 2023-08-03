package com.lumen.streams;

import java.util.Arrays;
import java.util.List;

public class BookStreamsDemo {
	public static void main(String[] args) {
		List<Book> books = Arrays.asList(new Book("Java","Kathy",200),
				new Book("Java","Kathy",200),
				new Book("Node","Jhon",200),
				new Book("Angukar","Kathy",200));
		books.stream()
			//.filter(book->book.getAuthor().equals("Kathy"))
			.map(book-> book.getTitle())
			.map(title-> (int)Math.pow(title.length(),2))
			.forEach(num->System.out.println(num));
			
		

		
	}

}

