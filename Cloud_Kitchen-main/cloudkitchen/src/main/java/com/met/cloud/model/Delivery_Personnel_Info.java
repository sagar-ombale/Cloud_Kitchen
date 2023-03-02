package com.met.cloud.model;

import java.sql.Blob;

public class Delivery_Personnel_Info {

	private int personnel_id;
	private String delivery_person_name;
	private String delivery_person_email;
	private String delivery_mobileno;
	private String delivery_username;
	private String delivery_address;
	private String delivery_city;
	private Blob delivery_image;
	private String delivery_aadharcard;
	public int getPersonnel_id() {
		return personnel_id;
	}
	public void setPersonnel_id(int personnel_id) {
		this.personnel_id = personnel_id;
	}
	public String getDelivery_person_name() {
		return delivery_person_name;
	}
	public void setDelivery_person_name(String delivery_person_name) {
		this.delivery_person_name = delivery_person_name;
	}
	public String getDelivery_person_email() {
		return delivery_person_email;
	}
	public void setDelivery_person_email(String delivery_person_email) {
		this.delivery_person_email = delivery_person_email;
	}
	public String getDelivery_mobileno() {
		return delivery_mobileno;
	}
	public void setDelivery_mobileno(String delivery_mobileno) {
		this.delivery_mobileno = delivery_mobileno;
	}
	public String getDelivery_username() {
		return delivery_username;
	}
	public void setDelivery_username(String delivery_username) {
		this.delivery_username = delivery_username;
	}
	public String getDelivery_address() {
		return delivery_address;
	}
	public void setDelivery_address(String delivery_address) {
		this.delivery_address = delivery_address;
	}
	public String getDelivery_city() {
		return delivery_city;
	}
	public void setDelivery_city(String delivery_city) {
		this.delivery_city = delivery_city;
	}
	public Blob getDelivery_image() {
		return delivery_image;
	}
	public void setDelivery_image(Blob delivery_image) {
		this.delivery_image = delivery_image;
	}
	public String getDelivery_aadharcard() {
		return delivery_aadharcard;
	}
	public void setDelivery_aadharcard(String delivery_aadharcard) {
		this.delivery_aadharcard = delivery_aadharcard;
	}
	
	@Override
	public String toString() {
		return "Delivery_Personnel_Info [personnel_id=" + personnel_id + ", delivery_person_name="
				+ delivery_person_name + ", delivery_person_email=" + delivery_person_email + ", delivery_mobileno="
				+ delivery_mobileno + ", delivery_username=" + delivery_username + ", delivery_address="
				+ delivery_address + ", delivery_city=" + delivery_city + ", delivery_image=" + delivery_image
				+ ", delivery_aadharcard=" + delivery_aadharcard + "]";
	}

}
