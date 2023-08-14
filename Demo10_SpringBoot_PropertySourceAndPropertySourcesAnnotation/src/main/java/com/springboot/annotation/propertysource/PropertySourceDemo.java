package com.springboot.annotation.propertysource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
public class PropertySourceDemo 
{
	@Autowired
	private Environment environment; //2 ways to read the property file -> Environment and @Value annotation
	
	//@Value("${mail.host}")
	private String host;
	//@Value("${mail.email}")
	private String email;
	//@Value("${mail.password}")
	private String password;
	//@Value("${app.name}")
	private String name;
	//@Value("${app.desc}")
	private String desc;
	
	public String getHost() {
		return environment.getProperty("mail.host");
	}
	public String getEmail() {
		return environment.getProperty("mail.email");
	}
	public String getPassword() {
		return environment.getProperty("mail.password");
	}
	public String getName() {
		return environment.getProperty("app.name");
	}
	public String getDesc() {
		return environment.getProperty("app.desc");
	}
}
