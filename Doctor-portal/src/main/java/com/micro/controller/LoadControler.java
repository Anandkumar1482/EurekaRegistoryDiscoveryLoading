package com.micro.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class LoadControler {

	@Autowired
	private RestTemplate restTemplate;
	String url = "http://doc-ser/getDoctors";

	@GetMapping(value = "/getDoc")
	public String getDoctor() {
		return restTemplate.getForObject(url, String.class);

	}
}
