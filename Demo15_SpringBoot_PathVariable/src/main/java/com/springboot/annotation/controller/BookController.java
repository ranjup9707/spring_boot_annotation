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
	@RequestMapping("/book/{id}")
	public ResponseEntity<Book> pathVariableDemo(@PathVariable int id){
		Book book = new Book();
		book.setId(id);
		return ResponseEntity.ok(book);
	}
}
