package com.met.cloud.model;

public class Cart_Table {
	
	private int cart_id;
	private int customer_id;
	private boolean cart_status;
	
	public int getCart_id() {
		return cart_id;
	}
	public void setCart_id(int cart_id) {
		this.cart_id = cart_id;
	}
	public int getCustomer_id() {
		return customer_id;
	}
	public void setCustomer_id(int customer_id) {
		this.customer_id = customer_id;
	}
	public boolean isCart_status() {
		return cart_status;
	}
	public void setCart_status(boolean cart_status) {
		this.cart_status = cart_status;
	}
	
	@Override
	public String toString() {
		return "Cart_Table [cart_id=" + cart_id + ", customer_id=" + customer_id + ", cart_status=" + cart_status + "]";
	}
}
