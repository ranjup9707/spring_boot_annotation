package com.springboot.annotation.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.annotation.beans.Book;

@RestController
public class BookController 
{
	@RequestMapping("/hello")
	public String helloWorld() {
		return "Hello World";
	}
	
	@RequestMapping("/book")
	public Book getBook() {
		Book book = new Book(1, "Core Java", "Learn Core Java & latest feature");
		return book;
	}
}
