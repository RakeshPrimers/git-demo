package com.example.MyFirstSpringbootApplication.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

	
	@RequestMapping("/hellogit")
	public String HelloMessage()
	{
		System.out.println("hello My dear Git");
		System.out.println("hello My dear Git");
		System.out.println("hello My dear Gi22");
		System.out.println("hello Added in Github repository remotely");
                System.out.println("hello My dear added from Developer 2 locally");
		return "hello mama Git";
	}
}
