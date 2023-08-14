package com.springboot.annotation.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.annotation.beans.Book;

@RestController
@RequestMapping("/api") 
public class BookController 
{
	@RequestMapping("/book/{id}/{title}")
	public ResponseEntity<Book> pathVariableDemo(@PathVariable int id, @PathVariable("title") String bookTitle){
		Book book = new Book();
		book.setId(id);
		return ResponseEntity.ok(book);
	}
}
