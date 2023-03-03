package com.met.cloud.model;

public class Customer_Info {

	private int customer_id;
	private String customer_name;
	private String customer_email;
	private String customer_mobno;
	private String customer_user_name;
	private String customer_password;
	private String customer_address;
	private String customer_pincode;
	private String customer_city;
	
	public String getCustomer_name() {
		return customer_name;
	}
	public void setCustomer_name(String customer_name) {
		this.customer_name = customer_name;
	}
	public String getCustomer_email() {
		return customer_email;
	}
	public void setCustomer_email(String customer_email) {
		this.customer_email = customer_email;
	}
	public String getCustomer_mobno() {
		return customer_mobno;
	}
	public void setCustomer_mobno(String customer_mobno) {
		this.customer_mobno = customer_mobno;
	}
	public String getCustomer_user_name() {
		return customer_user_name;
	}
	public void setCustomer_user_name(String customer_user_name) {
		this.customer_user_name = customer_user_name;
	}
	public String getCustomer_password() {
		return customer_password;
	}
	public void setCustomer_password(String customer_password) {
		this.customer_password = customer_password;
	}
	public String getCustomer_address() {
		return customer_address;
	}
	public void setCustomer_address(String customer_address) {
		this.customer_address = customer_address;
	}
	public String getCustomer_pincode() {
		return customer_pincode;
	}
	public void setCustomer_pincode(String customer_pincode) {
		this.customer_pincode = customer_pincode;
	}
	public String getCustomer_city() {
		return customer_city;
	}
	public void setCustomer_city(String customer_city) {
		this.customer_city = customer_city;
	}
	public int getCustomer_id() {
		return customer_id;
	}
	
	@Override
	public String toString() {
		return "Customer_Info [customer_id=" + customer_id + ", customer_name=" + customer_name + ", customer_email="
				+ customer_email + ", customer_mobno=" + customer_mobno + ", customer_user_name=" + customer_user_name
				+ ", customer_password=" + customer_password + ", customer_address=" + customer_address
				+ ", customer_pincode=" + customer_pincode + ", customer_city=" + customer_city + "]";
	}
}
