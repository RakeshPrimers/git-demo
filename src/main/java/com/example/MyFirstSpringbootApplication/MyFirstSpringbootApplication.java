package com.example.MyFirstSpringbootApplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class MyFirstSpringbootApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyFirstSpringbootApplication.class, args);
	}

	@RequestMapping("/mydear")
	public String Hello()
	{
		
		System.out.println("hello Git Exampl");
		System.out.println("hello Git Exampl");
		return "Heyy SpringBoot";
	}
}
