package com.springboot.annotation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.springboot.annotation.controller.MyController;
import com.springboot.annotation.controller.PizzaController;
import com.springboot.annotation.repository.MyRepository;
import com.springboot.annotation.service.MyService;

@SpringBootApplication
public class Demo6SpringBootStereotypeAnnotationApplication {

	public static void main(String[] args) {
		var context = SpringApplication.run(Demo6SpringBootStereotypeAnnotationApplication.class, args);
		
		PizzaController pizzaController = (PizzaController)context.getBean("pizzaController");
		System.out.println(pizzaController.getPizza());
		
		/*
		//VegPizza vegPizza = context.getBean(VegPizza.class);
		VegPizza vegPizza = (VegPizza)context.getBean("vegPizza");
		System.out.println(vegPizza.getPizza());
		*/
		
		MyController myController = context.getBean(MyController.class);
		System.out.println(myController.hello());
		
		MyService myService = context.getBean(MyService.class);
		System.out.println(myService.hello());
		
		MyRepository myRepository = context.getBean(MyRepository.class);
		System.out.println(myRepository.myRepository());
	}

}
