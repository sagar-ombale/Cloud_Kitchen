package com.met.project.restimpl;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import com.met.project.constants.KitchenConstant;
import com.met.project.rest.CustomerRest;
import com.met.project.service.CustomerService;
import com.met.project.utils.KitchenUtils;



@RestController
public class CustomerRestImpl implements CustomerRest {

	@Autowired
	CustomerService customerService;
	
	@Override
	public ResponseEntity<String> signup(Map<String, String> requestMap) {
		// TODO Auto-generated method stub
		try {
			return customerService.signUp(requestMap);
			
		}catch(Exception e){
			e.printStackTrace();
		}
		return KitchenUtils.getResposeEntity(KitchenConstant.SOMETHING_WENT_WRONG, HttpStatus.INTERNAL_SERVER_ERROR);
	}

}
