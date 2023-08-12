package com.masai.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PrintController {

	@GetMapping("/")
	public String printHandler() {
		return "Welcome to Spring boot and spring Security Application";
	}
}
