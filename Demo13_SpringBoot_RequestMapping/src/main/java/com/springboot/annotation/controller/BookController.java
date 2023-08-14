package com.springboot.annotation.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.annotation.beans.Book;

@RestController
@RequestMapping("/api") //Request Mapping with class
public class BookController 
{
	@RequestMapping("/hello") //Request Mapping with method
	public String helloWorld() {
		return "Hello World";
	}
	
	@RequestMapping(value =  {"/book", "/getBook"})//Request Mapping with multiple URI
	public Book getBook() {
		Book book = new Book(1, "Core Java", "Learn Core Java & latest feature");
		return book;
	}
	
	@RequestMapping(value =  {"getBook1"}, method = RequestMethod.GET)//Request Mapping with HTTP method
	public Book getBook1() {
		Book book = new Book(1, "Core Java", "Learn Core Java & latest feature");
		return book;
	}
	
	@RequestMapping(
			value = "getBook2", 
			produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE},
			consumes = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})//Request Mapping with Produces and Consumes
	public Book getBook2() {
		Book book = new Book(1, "Core Java", "Learn Core Java & latest feature");
		return book;
	}
}
