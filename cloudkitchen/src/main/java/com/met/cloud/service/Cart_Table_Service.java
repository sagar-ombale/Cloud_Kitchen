package com.met.cloud.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.met.cloud.dao.Cart_TableDAO;
import com.met.cloud.model.Cart_Table;

@Service
public class Cart_Table_Service {

	@Autowired
	private Cart_TableDAO cart_TableDAO;
	
	@Transactional(rollbackFor = Exception.class, propagation = Propagation.REQUIRED)
	public void save(Cart_Table cart_Table){
		
		if(cart_Table.getCat_Id() <0 ) {
			throw new RuntimeException("cart id can not be 0");
		}
		
		cart_TableDAO.save(cart_Table);
		System.out.println("cartTable DAO class: " + cart_TableDAO.getClass());
	}
	
	
	public  Cart_Table getCart(int id){
		
		return cart_TableDAO.getCart(id);	
	}
	
}
