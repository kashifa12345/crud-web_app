package com.example.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.example")
public class SpringbootThymleafCrudWebAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootThymleafCrudWebAppApplication.class, args);
	}

}
