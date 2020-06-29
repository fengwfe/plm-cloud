package com.fuwu.plm.admin.controller;


import javax.validation.Valid;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	@PostMapping("/hello")
	public String hello(@Valid @RequestBody User user) {
		System.out.println(user.getMyAddr().getLocation());
		System.out.println(1/0);
		System.out.println(user.getName());
		return "Hello admin service";
	}

}
