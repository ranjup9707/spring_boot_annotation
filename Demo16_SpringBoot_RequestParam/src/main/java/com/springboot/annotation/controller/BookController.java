package com.springboot.annotation.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.annotation.beans.Book;

@RestController
@RequestMapping("/api") 
public class BookController 
{
	@RequestMapping("/book")
	public ResponseEntity<Book> requestParamDemo(
			@RequestParam(name = "id") int id, 
			@RequestParam(name = "title") String bookTitle){
		Book book = new Book();
		book.setId(id);
		return ResponseEntity.ok(book);
	}
}
