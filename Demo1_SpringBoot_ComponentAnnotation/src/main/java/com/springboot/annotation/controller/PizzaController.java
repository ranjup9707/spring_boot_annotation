package com.springboot.annotation.controller;

import org.springframework.stereotype.Component;

@Component 
// This annotation tells IoC container to create Spring Bean for this class and manage it.
// Thus, no need to create an object using new keyword.
// Spring container gives the bean name as the class name but the first letter will be in small case.
// If an specific name is to be given then @Component("pizzaDemo") and this name will be retrieved in the main class.
public class PizzaController 
{
	public String getPizza() {
		return "Hot Pizza!";
	}
}
