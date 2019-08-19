package com.newOne.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.newOne.demo.domain.UserDTO;
import com.newOne.demo.services.userServices;

@RestController
@RequestMapping("/user")
public class User {
	
	@Autowired
	private userServices userServices;

	@GetMapping("/all")
	public List<UserDTO> allUsers() {
		return userServices.findAllUsers();
	}
	
	@PostMapping("/add")
	public String addUser(@RequestBody UserDTO userData){
		return userServices.saveUser(userData);
	}
	
	@PutMapping("/update")
	public String updateUser(@RequestBody UserDTO newUserData) {
		return userServices.updateUserData(newUserData);
	}
	
	@GetMapping("/find/{nic}")
	public UserDTO getUserById(@PathVariable Integer nic ) {
		return userServices.findById(nic);
	}
	
} 
