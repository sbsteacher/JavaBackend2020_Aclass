package com.koreait.first.method1;

public class Drink {
	private String productName;
	private int productPrice;
	
	public Drink(String productName, int productPrice) {		
		this.productName = productName;
		this.productPrice = productPrice;
	}
	
	public String getProductName() {
		return productName;
	}
	
	public int getProductPrice() {
		return productPrice;
	}
	
}
