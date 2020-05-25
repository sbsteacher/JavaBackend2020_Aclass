package com.koreait.first.cafe;

public class Coffee {
	private String name;
	public Coffee(MenuItem mi) {
		this.name = mi.getName();
	}
	
	public String getName() {
		return name;
	}
}
