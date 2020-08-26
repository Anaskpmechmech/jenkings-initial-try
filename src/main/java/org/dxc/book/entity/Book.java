package org.dxc.book.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="book")
public class Book {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="bid")
	private int bid;
	@Column(name="bookname")
	private String bookName;
	@Column(name="authorname")
	private String authorName;
	@Column(name="publisher")
	private String publisher;
	@Column(name="category")
	private String category;
	@Column(name="isbn")
	private String isbn;
	@Column(name="price")
	private double price;
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Book(int bid, String bookName, String authorName, String publisher, String category, String isbn,
			double price) {
		super();
		this.bid = bid;
		this.bookName = bookName;
		this.authorName = authorName;
		this.publisher = publisher;
		this.category = category;
		this.isbn = isbn;
		this.price = price;
	}
	public int getBid() {
		return bid;
	}
	public void setBid(int bid) {
		this.bid = bid;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getAuthorName() {
		return authorName;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
}
