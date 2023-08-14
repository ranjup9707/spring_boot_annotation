package com.springboot.annotation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.springboot.annotation.scope.PrototypeBean;
import com.springboot.annotation.scope.SingletonBean;

@SpringBootApplication
public class Demo8SpringBootSingletonAndPrototypeAnnotationApplication {

	public static void main(String[] args) {
		var context = SpringApplication.run(Demo8SpringBootSingletonAndPrototypeAnnotationApplication.class, args);
		SingletonBean singleton1 = context.getBean(SingletonBean.class); //Hashcode will be same as one bean is created
		System.out.println("Hashcode:" + singleton1.hashCode());
		SingletonBean singleton2 = context.getBean(SingletonBean.class);
		System.out.println("Hashcode:" + singleton2.hashCode());
		SingletonBean singleton3 = context.getBean(SingletonBean.class);
		System.out.println("Hashcode:" + singleton3.hashCode());
		PrototypeBean prototype1 = context.getBean(PrototypeBean.class); //Hashcode will be different as different bean is created
		System.out.println("Hashcode:" + prototype1.hashCode());
		PrototypeBean prototype2 = context.getBean(PrototypeBean.class);
		System.out.println("Hashcode:" + prototype2.hashCode());
		PrototypeBean prototype3 = context.getBean(PrototypeBean.class);
		System.out.println("Hashcode:" + prototype3.hashCode());
	}
}
