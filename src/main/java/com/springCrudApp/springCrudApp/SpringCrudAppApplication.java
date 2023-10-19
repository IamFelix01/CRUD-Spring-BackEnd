package com.springCrudApp.springCrudApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(exclude = { SecurityAutoConfiguration.class })
@ComponentScan(basePackages = "com.springCrudApp")
//@ComponentScan("com.springCrudApp.springCrudApp.*)
//@ComponentScan("com.springCrudApp.springCrudApp.repository")
//@ComponentScan(basePackages = {"com.springCrudApp.springCrudApp.controller", "com.springCrudApp.springCrudApp.repository"})
//@ComponentScan("com.springCrudApp.springCrudApp.controller")
//@ComponentScan("com.springCrudApp.springCrudApp.model")
//@ComponentScan("com.springCrudApp.springCrudApp.exception")
public class SpringCrudAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCrudAppApplication.class, args);
	}

}
