package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Product {
	@Id
	private int productId;
	private String productName;
	private int productPrice;
	private int avaiable;
	
	public int getProductId() {
		return productId;
	}
	
	public String getProductName() {
		return productName;
	}
	
	public int getProductPrice() {
		return productPrice;
	}
	
	public int getAvaiable() {
		return avaiable;
	}
	
	public void setProductId(int productId) {
		this.productId = productId;
	}
	
	public void setProductName(String productName) {
		this.productName = productName;
	}
	
	public void setProductPrice(int productPrice) {
		this.productPrice = productPrice;
	}
	
	public void setAvaiable(int avaiable) {
		this.avaiable = avaiable;
	}
	
	
	

}
