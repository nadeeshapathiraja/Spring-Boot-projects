package com.newOne.demo.services.impl;

import org.springframework.stereotype.Service;

import com.newOne.demo.services.userServices;


@Service
public class userServiceImpl implements userServices {

	@Override
	public String findAllUsers() {
		//database connection
		return "Return Final users";
	}

	
	
}
