package com.productdemo.web.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping()
public class ProductController {
	
	@GetMapping("/home")
	public String home() {
		return "This is a Home of Product Server";
	}
	
	@GetMapping("/product")
	public String product() {
		return "This is a product page of Product Server";
	}

}
