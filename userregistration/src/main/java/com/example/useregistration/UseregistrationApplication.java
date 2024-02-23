package com.example.useregistration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages  = "com.example.useregistration")
public class UseregistrationApplication {

	public static void main(String[] args) {
		SpringApplication.run(UseregistrationApplication.class, args);
	}

}
