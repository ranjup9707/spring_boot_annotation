package com.springboot.annotation.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.springboot.annotation.beans.Book;

@Controller
public class BookController 
{
	@RequestMapping("/hello")
	@ResponseBody //Returns the response as JSON format
	public String helloWorld() {
		return "Hello World";
	}
	
	@RequestMapping("/book")
	@ResponseBody
	public Book getBook() {
		Book book = new Book(1, "Core Java", "Learn Core Java & latest feature");
		return book;
	}
}
