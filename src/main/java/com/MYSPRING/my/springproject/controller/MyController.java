package com.MYSPRING.my.springproject.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
	@GetMapping("/home")
	public String sayHi() {
		return "hi spring security ? ? ?";
	}

	@GetMapping("admin")

	public String admin() {
		return " this is admin";
	}

}
