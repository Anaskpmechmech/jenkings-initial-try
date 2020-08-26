package org.dxc.book.controller;

import java.util.List;
import java.util.Optional;
import org.dxc.book.entity.Book;
import org.dxc.book.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/library")
public class BookController {

	@Autowired
	BookService bookService;

	@PostMapping("/savebook")
	public HttpStatus SaveBook(@RequestBody Book book) {
		boolean result = bookService.saveBook(book) != null;
		return result ? HttpStatus.CREATED : HttpStatus.BAD_REQUEST;
	}

	@GetMapping("/findall")
	public List<Book> findAll() {
		return bookService.findAll();
	}

	@DeleteMapping("/deletebook/{id}")
	public void deleteBook(@PathVariable("id") int bid) {
		System.out.println(bid);
		bookService.deleteBook(bid);
	}

	@GetMapping("/getbook/{id}")
	public Optional<Book> getBook(@PathVariable("id") int bid) {
		return bookService.getBook(bid);
	}

	@PutMapping("/updatebook/{id}")
	public HttpStatus updateBook(@RequestBody Book book, @PathVariable("id") int bid) {
		boolean result = bookService.updateBook(book, bid) != null;
		return result ? HttpStatus.CREATED : HttpStatus.BAD_REQUEST;
	}

	@GetMapping("/findbypublisher/{publisher}")
	public List<Book> findByPublisher(@PathVariable("publisher") String publisher) {
		return bookService.findByPublisher(publisher);
	}

	@GetMapping("/findbycategory/{category}")
	public List<Book> findByCategory(@PathVariable("category") String category) {
		return bookService.findByCategory(category);
	}

	@GetMapping("/findbyauthor/{author}")
	public List<Book> findByAuthor(@PathVariable("author") String author) {
		return bookService.findByAuthor(author);
	}

}
