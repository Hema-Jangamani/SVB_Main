package com.brillio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {
	
	@Autowired
	BookService bookService;
	
	@PostMapping("save")
	public void save(@RequestBody Book book) {
		System.out.println("Data added successfully");
		bookService.addBook(book);
	}
	
	@RequestMapping("/getAll")
	public String allBooks(){
		return bookService.getAllBooks().toString();
	}
	
	@RequestMapping("/getBook")
	public List<Book> getBook() {
		return bookService.getAllBooks();
	}
	
	@RequestMapping("/getBook/{id}")
	public Book getOneBook(@PathVariable int id) {
		return bookService.getBook(id);
	}
	
	@PutMapping("update/{id}")
	public Object updateBook(@PathVariable int id,@RequestBody Book book) {
		Book editUser= bookService.updateBook(book);
        if(book.getId()==id){
            return book;
        }else{
            return "No user Found";
        }
	}
	
	@DeleteMapping("delete/{id}")
	public void deleteBook(@PathVariable int id) {
		System.out.println("Data deleted");
		bookService.deleteBook(id);
	}
	

}
