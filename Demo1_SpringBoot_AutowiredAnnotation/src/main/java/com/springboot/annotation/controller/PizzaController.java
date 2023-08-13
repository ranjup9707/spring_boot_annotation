package com.springboot.annotation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.springboot.annotation.service.VegPizza;

@Component 
public class PizzaController 
{
	@Autowired //Field Injection
	private VegPizza vegPizza;

	/* Using Constructor Injection 
	@Autowired 
	// This annotation tells Spring container to automatically inject VegPizza bean using constructor
	public PizzaController(VegPizza vegPizza) {
		this.vegPizza = vegPizza;
	}
	*/
	
	
	/* Using Setter Injection
	@Autowired
	public void setVegPizza(VegPizza vegPizza) {
		this.vegPizza = vegPizza;
	}*/
	
	public String getPizza() {
		return vegPizza.getPizza();
	}
}
