package com.springboot.annotation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.springboot.annotation.controller.PizzaController;

@SpringBootApplication
public class Demo1SpringBootComponentAnnotationApplication {

	public static void main(String[] args) {
		// The method run() returns ApplicationContext object. Basically ApplicationContext
		// works as a IoC container 
		// Java 10 var type
		var context = SpringApplication.run(Demo1SpringBootComponentAnnotationApplication.class, args);
		PizzaController pizzaController = context.getBean(PizzaController.class);
		System.out.println(pizzaController.getPizza());
	}

}