package com.example.MyFirstSpringbootApplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class MyFirstSpringbootApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyFirstSpringbootApplication.class, args);
	}

	
}
