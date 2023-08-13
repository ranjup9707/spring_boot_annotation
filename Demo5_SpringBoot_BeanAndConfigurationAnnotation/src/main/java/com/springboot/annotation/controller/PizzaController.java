package com.springboot.annotation.controller;

import org.springframework.beans.factory.annotation.Autowired;

import com.springboot.annotation.service.Pizza;

/* @Component is removed as we are going to use Java based configuration and not Annotation based configuration*/
public class PizzaController 
{
	private Pizza pizza;

	@Autowired 
	public PizzaController(Pizza pizza) {
		this.pizza = pizza;
	}
	
	public String getPizza() {
		return pizza.getPizza();
	}
	
	public void init() {
		System.out.println("Initialization done");
	}
	
	public void destroy() {
		System.out.println("Destroy called");
	}
}
