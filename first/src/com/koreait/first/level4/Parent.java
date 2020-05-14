package com.koreait.first.level4;

public class Parent extends Object {
	private int weight;
		
	public Parent(int weight) {
		System.out.println("Parent 생성자!");
		this.weight = weight;
	}
	
	public void print() {
		System.out.println("I'm Parent!");
	}	
	public void ddd() {
		System.out.println("ddd");
	}
}
