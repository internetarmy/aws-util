package com.jenkins.artifact.controller;

import java.time.LocalDateTime;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	
	@GetMapping("/welcome")
	public String welcome() {
		return "Welcome: "+LocalDateTime.now();
	}

}
