package com.met.cloud.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.Data;

@Data
@Entity
public class Cart_Item_Table {

	@jakarta.persistence.Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int cart_Item_Id;
	private int cart_Id;
	private String name;
	private int price;
	private String description;
	private String imageAddress;
	
	
	
	public Cart_Item_Table() {
		
	}
	
	public Cart_Item_Table(int cart_Id, String name, int price, String description, String imageAddress) {
		super();
		this.cart_Id = cart_Id;
		this.name = name;
		this.price = price;
		this.description = description;
		this.imageAddress = imageAddress;
	}
	public int getCart_Item_Id() {
		return cart_Item_Id;
	}
	public void setCart_Item_Id(int cart_Item_Id) {
		this.cart_Item_Id = cart_Item_Id;
	}
	public int getCart_Id() {
		return cart_Id;
	}
	public void setCart_Id(int cart_Id) {
		this.cart_Id = cart_Id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	public String getImageAddress() {
		return imageAddress;
	}
	public void setImageAddress(String imageAddress) {
		this.imageAddress = imageAddress;
	}

	@Override
	public String toString() {
		return "Cart_Item_Table [cart_Item_Id=" + cart_Item_Id + ", cart_Id=" + cart_Id + ", name=" + name + ", price="
				+ price + ", description=" + description + ", imageAddress=" + imageAddress + "]";
	}
	 
	

	
}

