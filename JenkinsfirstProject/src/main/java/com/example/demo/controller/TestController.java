package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	
	@GetMapping(value="/get")
	public String get()
	{
		return "jenkins success";
	}

	
	@GetMapping(value="/test")
	public String get2()
	{
		return "get method call success";
	}
}
