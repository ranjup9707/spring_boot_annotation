package com.springboot.annotation.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.springboot.annotation.controller.PizzaController;
import com.springboot.annotation.service.NonVegPizza;
import com.springboot.annotation.service.VegPizza;

@Configuration
public class AppConfig 
{
	//@Bean
	//When name is to be given to the name. By default the bean name is the method name.
	@Bean("vegPizza")
	public VegPizza getVegPizza() {
		return new VegPizza(); //As @Bean is Java based config and hence new keyword is used
	}
	
	@Bean("nonVegPizza")
	public NonVegPizza getNonVegPizza() {
		return new NonVegPizza();
	}
	
	@Bean(initMethod = "init", destroyMethod = "destroy")
	public PizzaController pizzaController() {
		return new PizzaController(getNonVegPizza());
	}
	
}
