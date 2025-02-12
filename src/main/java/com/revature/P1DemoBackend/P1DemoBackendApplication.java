package com.revature.P1DemoBackend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EntityScan("com.revature.P1DemoBackend.model") //tells spring to scan this package for DB entity
@ComponentScan("com.revature.P1DemoBackend")
public class P1DemoBackendApplication {
	public static void main(String[] args) {
		SpringApplication.run(P1DemoBackendApplication.class, args);
		System.out.println("Our application is running!");
	}

}
