package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller

public class Hello {
	@GetMapping("/")
	public String Hello (Model name ) {
		name.addAttribute("username","Hello");
		name.addAttribute("password","Hello");
		
		return "Hello";
	}

}
