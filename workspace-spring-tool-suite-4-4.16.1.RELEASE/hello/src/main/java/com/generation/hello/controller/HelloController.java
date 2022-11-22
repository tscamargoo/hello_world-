package com.generation.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")

public class HelloController {
  
	@GetMapping
	public String Hello () {
    return "Hello Mercado livre !!!"; 
	}
    
    @GetMapping ("/mensagem")
	public String Hello_2 () {
    return "Hello brasil !!!"; 
    
	}
}