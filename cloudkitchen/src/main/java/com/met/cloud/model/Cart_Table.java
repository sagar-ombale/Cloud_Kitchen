package com.met.cloud.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.Data;

@Data
@Entity
public class Cart_Table {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int cat_Id;
	private String name;
	private String imageAddress;
	
	@OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	//@JoinColumn(name = cat_Id)
	private Cart_Item_Table cart_Item_Table;
	
	public int getCat_Id() {
		return cat_Id;
	}
	public void setCat_Id(int cat_Id) {
		this.cat_Id = cat_Id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getImageAddress() {
		return imageAddress;
	}
	public void setImageAddress(String imageAddress) {
		this.imageAddress = imageAddress;
	}
	
	@Override
	public String toString() {
		return "Cart_Table [cart_Id=" + cat_Id + ", name=" + name + ", imageAddress=" + imageAddress + "]";
	}
	
	
}
