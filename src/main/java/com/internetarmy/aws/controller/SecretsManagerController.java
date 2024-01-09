package com.internetarmy.aws.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.internetarmy.aws.service.impl.EdxServiceImpl;

@RestController
public class SecretsManagerController {
	
	@Autowired
	private EdxServiceImpl secretsService;
	
	@GetMapping("getSecrets")
	public String getSecrets(@RequestParam String secretName) {
		return secretsService.getSecretValue(secretName);
	}

}
