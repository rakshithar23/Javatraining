package com.bookapp.model;

import java.time.LocalDate;

import java.util.Arrays;
import java.util.List;

public class BookDetails {
	public static List<Book> showBooks(){
		return Arrays.asList(
				new Book("Java in Action","Jhon David","Tech",1,900.90,LocalDate.of(2010,03,20)),
				new Book("Java in Action","Jhon David","Tech",1,900.90,LocalDate.of(2010,03,20)),
				
		
	}

}
