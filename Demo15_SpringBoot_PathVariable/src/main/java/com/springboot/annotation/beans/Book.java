package com.springboot.annotation.beans;

public class Book 
{
	private int id;
	private String bookTitle;
	private String desc;
	
	public Book() {
	}
	
	public Book(int id, String bookTitle, String desc) {
		super();
		this.id = id;
		this.bookTitle = bookTitle;
		this.desc = desc;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBookTitle() {
		return bookTitle;
	}
	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	
}
