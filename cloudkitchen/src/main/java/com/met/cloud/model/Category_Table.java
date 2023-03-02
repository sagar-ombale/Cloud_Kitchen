package com.met.cloud.model;

import java.sql.Blob;

public class Category_Table {

	private int category_id;
	private String category_name;
	private Blob category_image;
	public int getCategory_id() {
		return category_id;
	}
	public void setCategory_id(int category_id) {
		this.category_id = category_id;
	}
	public String getCategory_name() {
		return category_name;
	}
	public void setCategory_name(String category_name) {
		this.category_name = category_name;
	}
	public Blob getCategory_image() {
		return category_image;
	}
	public void setCategory_image(Blob category_image) {
		this.category_image = category_image;
	}
	
	@Override
	public String toString() {
		return "Category_Table [category_id=" + category_id + ", category_name=" + category_name + ", category_image="
				+ category_image + "]";
	}
}
