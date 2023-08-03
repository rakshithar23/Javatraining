package com.bookapp.model;

import java.util.List;

public class IBookService {
	
	public interface IBookService{
		void addBook(Book book);
		List<Book>getAll();
		List<Book> getByAuthorcontains(String author)throws BookNotFoundException;
		List<Book> getBycategory(String category)throws BookNotFoundException;
		List<Book> getByPricelessThan(double price)throws BookNotFoundException;
		List<Book> getByAuthorcontains(String author)throws BookNotFoundExceptions;
		List<Book> getByAuthorcontains(String author)throws BookNotFoundExceptions;
		
		}

}
