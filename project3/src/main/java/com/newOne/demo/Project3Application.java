package com.newOne.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@SpringBootApplication
public class Project3Application {

	@RequestMapping
	@ResponseBody
	public static void main(String[] args) {
		SpringApplication.run(Project3Application.class, args);
	}

}
