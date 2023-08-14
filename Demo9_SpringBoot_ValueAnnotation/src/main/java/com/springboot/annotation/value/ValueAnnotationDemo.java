package com.springboot.annotation.value;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ValueAnnotationDemo 
{
	@Value("Default Name")
	private String defaultName;
	
	@Value("${mail.host}") //Read value from properties file
	private String host;
	
	@Value("${mail.email}")
	private String email;
	
	@Value("${mail.password}")
	private String password;
	
	@Value("${java.home}") //Get value from environment variable
	private String home;

	public String getDefaultName() {
		return defaultName;
	}

	public String getHost() {
		return host;
	}

	public String getEmail() {
		return email;
	}

	public String getPassword() {
		return password;
	}

	public String getHome() {
		return home;
	}
	
}
