package com.koreait.first.level4;

public class Child extends Parent {		
	public Child() {		
		super(10);
		System.out.println("Child 생성자!");
		
	}	
	@Override	
	public void ddd() {		
		System.out.println("DDD");
		super.ddd();
	}	
	
}











