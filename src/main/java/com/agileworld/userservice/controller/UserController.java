package com.agileworld.userservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.agileworld.userservice.models.Person;

@RestController
public class UserController {
	
	@GetMapping("/hello")
	public String sayHello() {
		return "Hello World";
	}
	
	@GetMapping("/hello/{name}")
	public String sayHello(@PathVariable String name) {
		return "Hello "+name;
	}
	
	@GetMapping("/hello/{firstName}/{lastName}")
	public Person sayHello(@PathVariable String firstName, @PathVariable String lastName) {
		
		Person p = new Person();
		p.setFirstName(firstName);
		p.setLastName(lastName);
		return p;
	}

}
