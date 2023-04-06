package com.example1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class logincontroller {
@GetMapping("/login")
public String getlogin() {
	
	return "login";
}
@PostMapping("/login")
public String getwelcome(@RequestParam  String email, @RequestParam  String password) {
	return "welcome";
}
}
