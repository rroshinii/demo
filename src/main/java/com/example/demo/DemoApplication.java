package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// Enables Spring Boot auto-configuration and component scanning
@SpringBootApplication
public class DemoApplication {

	// Entry point of the Spring Boot application
	public static void main(String[] args) {

		// Starts the Spring Boot application
		SpringApplication.run(DemoApplication.class, args);
	}
}
