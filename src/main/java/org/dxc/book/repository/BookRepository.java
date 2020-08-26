package org.dxc.book.repository;

import java.util.List;
import java.util.Optional;

import org.dxc.book.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface BookRepository extends JpaRepository<Book,Integer>{
	
	
	@Query("SELECT b from Book b WHERE b.publisher=:publisher")
	List<Book> findByPublisherName(@Param("publisher")String publisher);
	
	@Query("SELECT b from Book b WHERE b.category=:category")
	List<Book> findbyCategory(@Param("category")String category);
	
	
	@Query("SELECT b FROM Book b WHERE b.authorName=:authorName")
	List<Book> findByAuthor(@Param("authorName")String authorName);

}
