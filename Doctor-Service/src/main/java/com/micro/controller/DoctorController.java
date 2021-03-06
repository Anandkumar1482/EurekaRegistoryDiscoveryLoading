package com.micro.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DoctorController {

	@Value("${server.port}")
	private String port;

	int count = 0;

	@GetMapping(value = "/getDoctors")
	public String getDoctors() {
		count++;
		return count + " ->list of doctors from the " + port;
	}
}
