package com.springboot.annotation.propertysource;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;

@Configuration
//@PropertySource("classpath:mail.properties")
//@PropertySource("classpath:message.properties")

//Provide multiple properties file
@PropertySources({
	@PropertySource("classpath:mail.properties"),
	@PropertySource("classpath:message.properties")
})
public class AppConfig 
{	
}
