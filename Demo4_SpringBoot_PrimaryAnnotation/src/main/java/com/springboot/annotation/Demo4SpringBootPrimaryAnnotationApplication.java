package com.springboot.annotation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.springboot.annotation.controller.PizzaController;

@SpringBootApplication
public class Demo4SpringBootPrimaryAnnotationApplication {

	public static void main(String[] args) {
		var context = SpringApplication.run(Demo4SpringBootPrimaryAnnotationApplication.class, args);
		PizzaController pizzaController = context.getBean(PizzaController.class);
		System.out.println(pizzaController.getPizza());
	}

}
