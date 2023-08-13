package com.springboot.annotation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.springboot.annotation.controller.PizzaController;
import com.springboot.annotation.service.VegPizza;

@SpringBootApplication
public class Demo5SpringBootBeanAndConfigurationAnnotationApplication {

	public static void main(String[] args) {
		var context = SpringApplication.run(Demo5SpringBootBeanAndConfigurationAnnotationApplication.class, args);
		
		PizzaController pizzaController = (PizzaController)context.getBean("pizzaController");
		System.out.println(pizzaController.getPizza());
		
		/*
		//VegPizza vegPizza = context.getBean(VegPizza.class);
		VegPizza vegPizza = (VegPizza)context.getBean("vegPizza");
		System.out.println(vegPizza.getPizza());
		*/
	}

}
