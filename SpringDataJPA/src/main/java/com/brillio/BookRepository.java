package com.brillio;

import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Integer>{
	
	//getAllBooks()
	//getBook(String id)
	//updateBook(String id)
	//deleteBook(String id)

}
