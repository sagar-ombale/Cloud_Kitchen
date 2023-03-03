package com.met.project.pojo;

import java.io.Serializable;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.Table;
import lombok.Data;


@NamedQuery(name="CustomerInfo.findByEmailId",query = " select c from CustomerInfo c where c.customerEmail =: customerEmail")

@Data
@Entity
@DynamicUpdate
@DynamicInsert
@Table(name="customer_info")
public class CustomerInfo implements Serializable {
	
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "customer_id")
	private int customerId;
	
	@Column(name = "customer_name")
	private String customerName;
	
	@Column(name = "customer_email")
	private String customerEmail;
	
	@Column(name = "customer_mobno")
	private String customerMobno;
	
	@Column(name = "customer_user_name")
	private String customerUserName;
	
	@Column(name = "customer_password")
	private String customerPassword;
	
	@Column(name = "customer_address")
	private String customerAddress;
	
	@Column(name = "customer_pincode")
	private String customerPincode;
	
	@Column(name = "customer_city")
	private String customerCity;

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerEmail() {
		return customerEmail;
	}

	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}

	public String getCustomerMobno() {
		return customerMobno;
	}

	public void setCustomerMobno(String customerMobno) {
		this.customerMobno = customerMobno;
	}

	public String getCustomerUserName() {
		return customerUserName;
	}

	public void setCustomerUserName(String customerUserName) {
		this.customerUserName = customerUserName;
	}

	public String getCustomerPassword() {
		return customerPassword;
	}

	public void setCustomerPassword(String customerPassword) {
		this.customerPassword = customerPassword;
	}

	public String getCustomerAddress() {
		return customerAddress;
	}

	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}

	public String getCustomerPincode() {
		return customerPincode;
	}

	public void setCustomerPincode(String customerPincode) {
		this.customerPincode = customerPincode;
	}

	public String getCustomerCity() {
		return customerCity;
	}

	public void setCustomerCity(String customerCity) {
		this.customerCity = customerCity;
	}

	public int getCustomerId() {
		return customerId;
	}
	
}
