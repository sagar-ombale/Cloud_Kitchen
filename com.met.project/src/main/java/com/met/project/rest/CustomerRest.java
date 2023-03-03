package com.met.project.rest;

import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping(path= "/customer")
public interface CustomerRest {
	
	@PostMapping(path = "/signup")
	public ResponseEntity<String> signup(@RequestBody(required = true) Map<String, String> requestMap);
} 
