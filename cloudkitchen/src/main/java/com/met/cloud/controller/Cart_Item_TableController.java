package com.met.cloud.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.met.cloud.model.Cart_Item_Table;
import com.met.cloud.service.Cart_Item_Table_Service;

@RestController
@RequestMapping("/cartitemtable")
public class Cart_Item_TableController {

	@Autowired
	private Cart_Item_Table_Service cart_Item_Table_Service;
	
	@RequestMapping(value = "allCartItem", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Collection<Cart_Item_Table>> getAllCartItem(){
		
		Collection<Cart_Item_Table> allCartItem = cart_Item_Table_Service.getAllCartItem();
		return new ResponseEntity<Collection<Cart_Item_Table>>(allCartItem, HttpStatus.OK);
	}
	
	//http://localhost:8080/cartitemtable/allCartItem --> get API for Item_table
	
	@RequestMapping(value = "getItem/{id}", produces = {MediaType.APPLICATION_JSON_VALUE})
	public ResponseEntity<Cart_Item_Table> getCartItem(@PathVariable int id){
		System.out.println(id);
		Cart_Item_Table cart_Item_Table = cart_Item_Table_Service.getCartItem(id);
		
		return new ResponseEntity<Cart_Item_Table>(cart_Item_Table, HttpStatus.ACCEPTED);
		
	}
	
	@PutMapping(value = "updateItem", produces = {MediaType.APPLICATION_JSON_VALUE})
	public ResponseEntity<Cart_Item_Table> updateCartItem(@RequestBody Cart_Item_Table cart_Item_Table){
//		Cart_Item_TableDAO cart_Item_TableDAO = new Cart_Item_TableDAO();
//		cart_Item_TableDAO.save(cart_Item_Table);
//		return new ResponseEntity<Cart_Item_Table>(cart_Item_Table, HttpStatus.OK);
		return null;
	}
	//http://localhost:8080/updateItem
	
	
	@DeleteMapping(value = "deleteItem/{id}", produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
	public ResponseEntity<Cart_Item_Table> deleteCartItem(@PathVariable int id){
		
		
		return null;		
	}
	
	@PostMapping
	@RequestMapping(value = "insertItem", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Cart_Item_Table> saveEmp(@RequestBody Cart_Item_Table cart_Item_Table){
		
		cart_Item_Table_Service.save(cart_Item_Table);
		
		return new ResponseEntity<Cart_Item_Table>(cart_Item_Table, HttpStatus.OK);
		
		
	}
}
