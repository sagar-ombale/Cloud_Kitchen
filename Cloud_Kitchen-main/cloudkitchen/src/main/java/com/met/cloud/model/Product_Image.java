package com.met.cloud.model;

import java.sql.Blob;

public class Product_Image {
	
	private int product_image_id;
	private int product_id;
	private Blob product_image_image;
	public int getProduct_image_id() {
		return product_image_id;
	}
	public void setProduct_image_id(int product_image_id) {
		this.product_image_id = product_image_id;
	}
	public int getProduct_id() {
		return product_id;
	}
	public void setProduct_id(int product_id) {
		this.product_id = product_id;
	}
	public Blob getProduct_image_image() {
		return product_image_image;
	}
	public void setProduct_image_image(Blob product_image_image) {
		this.product_image_image = product_image_image;
	}
	@Override
	public String toString() {
		return "product_image [product_image_id=" + product_image_id + ", product_id=" + product_id
				+ ", product_image_image=" + product_image_image + "]";
	}
}
