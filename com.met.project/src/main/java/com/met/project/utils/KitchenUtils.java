package com.met.project.utils;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class KitchenUtils {
	
	private KitchenUtils() {
		
	}
	
	public static ResponseEntity<String> getResposeEntity(String responseMsg, HttpStatus httpStatus){
		return new ResponseEntity<String>("{\"message\":\""+ responseMsg + "\"}",httpStatus);
	}
}
