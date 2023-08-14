package com.springboot.annotation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.springboot.annotation.propertysource.PropertySourceDemo;

@SpringBootApplication
public class Demo10SpringBootPropertySourceAndPropertySourcesAnnotationApplication {

	public static void main(String[] args) {
		var context = SpringApplication.run(Demo10SpringBootPropertySourceAndPropertySourcesAnnotationApplication.class, args);
		PropertySourceDemo propertySource = context.getBean(PropertySourceDemo.class);
		System.out.println(propertySource.getEmail());
		System.out.println(propertySource.getHost());
		System.out.println(propertySource.getPassword());
		System.out.println(propertySource.getName());
		System.out.println(propertySource.getDesc());
	}
}
