package com.springboot.annotation.repository;

import org.springframework.stereotype.Repository;

@Repository
public class MyRepository 
{
	public String myRepository() {
		return "Hello Repository";
	}
}
