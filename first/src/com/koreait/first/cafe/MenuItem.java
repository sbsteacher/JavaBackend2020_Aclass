package com.koreait.first.cafe;

public class MenuItem {
	private String name;
	private int price;
	
	public MenuItem(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}
	
	public String getName() {
		return name;
	}
	
	public int getPrice() {
		return price;
	}
}