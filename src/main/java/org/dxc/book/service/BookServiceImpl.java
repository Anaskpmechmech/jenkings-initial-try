package org.dxc.book.service;

import java.util.List;
import java.util.Optional;

import org.dxc.book.entity.Book;
import org.dxc.book.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;


@Service
public class BookServiceImpl implements BookService{
	
	@Autowired
	BookRepository bookRepository;

	@Override
	public Book saveBook(Book book) {
	return bookRepository.save(book);
	}
	@Override
	public List<Book> findAll() {
		return bookRepository.findAll();
	}
	@Override
	public void deleteBook(int bid) {
		bookRepository.deleteById(bid);
	}
	@Override
	public Optional<Book> getBook(int bid) {
		return bookRepository.findById(bid);
	}
	@Override
	public Book updateBook(Book book, int id) {
		Book availabelBook=bookRepository.findById(id).get();
		availabelBook.setBookName(book.getBookName());
		availabelBook.setAuthorName(book.getAuthorName());
		availabelBook.setCategory(book.getCategory());
		availabelBook.setIsbn(book.getIsbn());
		availabelBook.setPublisher(book.getPublisher());
		availabelBook.setPrice(book.getPrice());
		return bookRepository.save(availabelBook);
			
		}
	@Override
	public List<Book> findByPublisher(String publisher) {
		return bookRepository.findByPublisherName(publisher);
	}
	@Override
	public List<Book> findByCategory(String category) {
		return bookRepository.findbyCategory(category);
	}
	@Override
	public List<Book> findByAuthor(String author) {
		return bookRepository.findByAuthor(author);
	}
		
	}

	


