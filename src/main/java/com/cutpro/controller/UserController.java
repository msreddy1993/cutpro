package com.cutpro.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	@RequestMapping(value="/auth/test")
	public void test() {
		System.out.println("SUCCESS");
	}
}
