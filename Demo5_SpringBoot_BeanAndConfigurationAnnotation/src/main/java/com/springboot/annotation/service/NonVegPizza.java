package com.springboot.annotation.service;

/* Earlier @Component annotation was used to tell Spring container to create Spring Bean for this class
* Now to create explicit bean for this class using @Bean annotation we remove @Component annotation */
public class NonVegPizza implements Pizza{

	@Override
	public String getPizza() {
		return "Non Veg Pizza!";
	}

}
