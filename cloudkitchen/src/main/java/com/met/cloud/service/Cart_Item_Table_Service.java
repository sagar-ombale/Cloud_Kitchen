package com.met.cloud.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.met.cloud.dao.Cart_Item_TableDAO;
import com.met.cloud.model.Cart_Item_Table;

@Service
public class Cart_Item_Table_Service {

	@Autowired
	private Cart_Item_TableDAO caDao;
	
	@Transactional(rollbackFor = Exception.class, propagation = Propagation.REQUIRED)
	public void save(Cart_Item_Table cart_Item_Table){
		
		if(cart_Item_Table.getCart_Item_Id() <0 ) {
			throw new RuntimeException("cart id can not be 0");
		}
		
		caDao.save(cart_Item_Table);
		System.out.println("cartTable DAO class: " + caDao.getClass());
	}
	
	
	public  Collection<Cart_Item_Table> getAllCartItem(){
		
		return caDao.getAllCartItem();
		
	}
	
	//@Transactional -> if using hibernate 
	
	public Cart_Item_Table getCartItem(int id) {
		return caDao.getCartItem(id);
	}
}
