package com.springboot.annotation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.springboot.annotation.service.Pizza;

@Component 
public class PizzaController 
{
	private Pizza pizza;

	@Autowired 
	public PizzaController(@Qualifier("vegPizza") Pizza pizza) {
		this.pizza = pizza;
	}
	
	public String getPizza() {
		return pizza.getPizza();
	}
}
