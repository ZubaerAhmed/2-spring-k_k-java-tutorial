package com.example.springk_kjavatutorial.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class FirstController {

	
	@GetMapping(value="/")
	//@RequestMapping(value="/",method=RequestMethod.GET)
	public String hello(){
		return "zubaer:  "+ new java.util.Date();
	}
}
