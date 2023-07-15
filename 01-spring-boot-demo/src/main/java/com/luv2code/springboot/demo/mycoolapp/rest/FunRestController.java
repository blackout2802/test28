package com.luv2code.springboot.demo.mycoolapp.rest;

import java.time.LocalDateTime;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {
	
	//expoes "/" that returns the hello world
	
	@GetMapping("/")
	public String sayHello() {
		
		return "Hello World ! The time on the server is : " +LocalDateTime.now();
	}

}
