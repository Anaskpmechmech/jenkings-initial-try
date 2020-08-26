package org.dxc.book.service;

import java.util.List;
import java.util.Optional;

import org.dxc.book.entity.Book;
import org.springframework.http.HttpStatus;

public interface BookService {
	
	public void deleteBook(int id);
	public Book saveBook(Book book);
	public List<Book> findAll();
	public Optional<Book> getBook(int bid);
	public Book updateBook(Book book,int id);
	public List<Book> findByPublisher(String publisher);
	public List<Book> findByCategory(String category);
	public List<Book> findByAuthor(String author);
	
	
}
