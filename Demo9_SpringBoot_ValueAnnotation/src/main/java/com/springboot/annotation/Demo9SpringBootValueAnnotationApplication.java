package com.springboot.annotation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.springboot.annotation.value.ValueAnnotationDemo;

@SpringBootApplication
public class Demo9SpringBootValueAnnotationApplication {

	public static void main(String[] args) {
		var context = SpringApplication.run(Demo9SpringBootValueAnnotationApplication.class, args);
		ValueAnnotationDemo valueAnnotationDemo = context.getBean(ValueAnnotationDemo.class);
		System.out.println(valueAnnotationDemo.getDefaultName());
		System.out.println(valueAnnotationDemo.getEmail());
		System.out.println(valueAnnotationDemo.getHost());
		System.out.println(valueAnnotationDemo.getPassword());
		System.out.println("Java Home:" + valueAnnotationDemo.getHome());
	}
}
