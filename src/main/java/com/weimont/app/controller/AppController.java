package com.weimont.app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v2/demoapi")
public class AppController {

	@GetMapping
	public String saludo2() {
		return "hola a todos3";
	}
	
}
