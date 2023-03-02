package com.met.project.serviceimpl;

import java.util.Map;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.met.project.constants.KitchenConstant;
import com.met.project.dao.CustomerInfoDAO;
import com.met.project.pojo.CustomerInfo;
import com.met.project.service.CustomerService;
import com.met.project.utils.KitchenUtils;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	CustomerInfoDAO custInfoDAO;
	
	
	@Override
	public ResponseEntity<String> signUp(Map<String, String> requestMap) {
		// TODO Auto-generated method stub
		try {
		if(validateSignUp(requestMap)) {
			CustomerInfo custInfo = custInfoDAO.findByEmailId(requestMap.get("customerEmail"));
			if(Objects.isNull(custInfo)) {
				custInfoDAO.save(getCustInfo(requestMap));
				return KitchenUtils.getResposeEntity("Successfully Registered", HttpStatus.OK);
			}
		}else {
		return KitchenUtils.getResposeEntity(KitchenConstant.INVALID_DATA, HttpStatus.BAD_REQUEST);
		}
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		return KitchenUtils.getResposeEntity(KitchenConstant.SOMETHING_WENT_WRONG, HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	private boolean validateSignUp(Map<String, String> requestMap) {
		if(requestMap.containsKey("customerName") && requestMap.containsKey("customerEmail") && requestMap.containsKey("customerMobNo")
		&& requestMap.containsKey("customerUserName")&& requestMap.containsKey("customerPassword") && requestMap.containsKey("customerAddress")
		&& requestMap.containsKey("customerPincode")&&requestMap.containsKey("customerCity")) {
			return true;
		}
		return false;
	}
	
	private CustomerInfo getCustInfo(Map<String, String> requestMap){
		CustomerInfo custInfo = new CustomerInfo();
		custInfo.setCustomerName(requestMap.get("cutomerName"));
		custInfo.setCustomerEmail(requestMap.get("customerEmail"));
		custInfo.setCustomerMobno(requestMap.get("customerMobNo"));
		custInfo.setCustomerUserName(requestMap.get("customerUserName"));
		custInfo.setCustomerPassword(requestMap.get("customerPassword"));
		custInfo.setCustomerAddress(requestMap.get("customerAddress"));
		custInfo.setCustomerPincode(requestMap.get("customerPincode"));
		custInfo.setCustomerCity(requestMap.get("customerCity"));
		return custInfo;
	}

}
