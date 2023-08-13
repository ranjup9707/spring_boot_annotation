package com.springboot.annotation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.springboot.annotation.lazy.LazyLoader;

@SpringBootApplication
public class Demo7SpringBootLazyAnnotationApplication {

	public static void main(String[] args) {
		var context = SpringApplication.run(Demo7SpringBootLazyAnnotationApplication.class, args);
		
		//Spring container will create Spring bean only when called else won't create
		//If below code not present then output will have only Eager Loader
		//If below code present then output will have only Eager Loader and Lazy Loader
		LazyLoader lazyLoader = context.getBean(LazyLoader.class);
	}
}
