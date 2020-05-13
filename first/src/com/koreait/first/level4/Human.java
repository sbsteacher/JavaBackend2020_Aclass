package com.koreait.first.level4;

public class Human extends Object {	
	private String name;
	private int age;
	
	public Human() {		
		this("이순신", 20);
	}
	
	public Human(String name) {
		this(name, 20);
	}
	
	public Human(int age) {
		this("이순신", age);
	}
	
	public Human(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}	

	public void printMyInfo() {
		System.out.printf("name: %s, age: %d\n"
				, name, age);
	}
	
}
