package com.brillio;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {
	
	@Autowired
	BookRepository bookRepository;
	
	List<Book> getAllBooks(){
		List<Book> books = new ArrayList<>();
		bookRepository.findAll().forEach(books::add);
		return books;
	}
	
	void addBook(Book book) {
		bookRepository.save(book);
	}
	
	Book updateBook(Book book) {
		Book book1 = bookRepository.save(book);
		if(book1!=null) {
			return book1;
		}
		return null;
	}
	
	Book getBook(int id) {
		return bookRepository.findById(id).get();
	}
	
	void deleteBook(int id) {
		bookRepository.deleteById(id);
	}

}
