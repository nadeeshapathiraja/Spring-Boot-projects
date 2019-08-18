package com.newOne.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.newOne.demo.services.userServices;

@RestController
@RequestMapping("/user")
public class User {
	
	@Autowired
	private userServices userServices;

	@GetMapping("/all")
	public String allUsers() {
		return userServices.findAllUsers();
	}
	
}
