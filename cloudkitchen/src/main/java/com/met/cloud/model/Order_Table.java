package com.met.cloud.model;

import java.sql.Timestamp;

public class Order_Table {

	private int order_id;
	private Timestamp orderdate;
	private String order_description;
	private double order_total_cost;
	private int customer_id;
	private int product_id;
	private int order_quantity;
	private boolean order_status;
	private String order_paymentby;
	private String order_shipping_address;
	private String order_city;
	
	public int getOrder_id() {
		return order_id;
	}
	public void setOrder_id(int order_id) {
		this.order_id = order_id;
	}
	public Timestamp getOrderdate() {
		return orderdate;
	}
	public void setOrderdate(Timestamp orderdate) {
		this.orderdate = orderdate;
	}
	public String getOrder_description() {
		return order_description;
	}
	public void setOrder_description(String order_description) {
		this.order_description = order_description;
	}
	public double getOrder_total_cost() {
		return order_total_cost;
	}
	public void setOrder_total_cost(double order_total_cost) {
		this.order_total_cost = order_total_cost;
	}
	public int getCustomer_id() {
		return customer_id;
	}
	public void setCustomer_id(int customer_id) {
		this.customer_id = customer_id;
	}
	public int getProduct_id() {
		return product_id;
	}
	public void setProduct_id(int product_id) {
		this.product_id = product_id;
	}
	public int getOrder_quantity() {
		return order_quantity;
	}
	public void setOrder_quantity(int order_quantity) {
		this.order_quantity = order_quantity;
	}
	public boolean isOrder_status() {
		return order_status;
	}
	public void setOrder_status(boolean order_status) {
		this.order_status = order_status;
	}
	public String getOrder_paymentby() {
		return order_paymentby;
	}
	public void setOrder_paymentby(String order_paymentby) {
		this.order_paymentby = order_paymentby;
	}
	public String getOrder_shipping_address() {
		return order_shipping_address;
	}
	public void setOrder_shipping_address(String order_shipping_address) {
		this.order_shipping_address = order_shipping_address;
	}
	public String getOrder_city() {
		return order_city;
	}
	public void setOrder_city(String order_city) {
		this.order_city = order_city;
	}
	
	@Override
	public String toString() {
		return "Order_Table [order_id=" + order_id + ", orderdate=" + orderdate + ", order_description="
				+ order_description + ", order_total_cost=" + order_total_cost + ", customer_id=" + customer_id
				+ ", product_id=" + product_id + ", order_quantity=" + order_quantity + ", order_status=" + order_status
				+ ", order_paymentby=" + order_paymentby + ", order_shipping_address=" + order_shipping_address
				+ ", order_city=" + order_city + "]";
	}	
}
