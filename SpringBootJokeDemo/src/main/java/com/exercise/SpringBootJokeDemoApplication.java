package com.exercise;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath:chuck-config.xml")
public class SpringBootJokeDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootJokeDemoApplication.class, args);
	}
}
