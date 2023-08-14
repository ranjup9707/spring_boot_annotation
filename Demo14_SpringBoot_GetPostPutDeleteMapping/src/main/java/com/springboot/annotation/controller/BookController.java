package com.springboot.annotation.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.annotation.beans.Book;

@RestController
@RequestMapping("/api") 
public class BookController 
{
	@GetMapping("/hello") 
	public String helloWorld() {
		return "Hello World";
	}
	
	@RequestMapping(value =  {"/book", "/getBook"})
	public Book getBook() {
		Book book = new Book(1, "Core Java", "Learn Core Java & latest feature");
		return book;
	}
	
	@PostMapping("/createBook")
	public ResponseEntity<Book> createBook(@RequestBody Book book) {
		System.out.println(book.getId());
		return new ResponseEntity<>(book, HttpStatus.CREATED);
	}
	
	@PutMapping("/updateBook")
	public ResponseEntity<Book> updateBook(int id, @RequestBody Book book) {
		System.out.println(book.getId());
		book.setId(id);
		return ResponseEntity.ok(book);
	}
	
	@DeleteMapping("/deleteBook")
	public ResponseEntity<String> deleteBook(int id) {
		return ResponseEntity.ok("Book delete successfully");
	}
}
