package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Atenadcontroller {
	@GetMapping("/create2")
	public String create2(Model model) {
		return "create2";
		
	}
}
