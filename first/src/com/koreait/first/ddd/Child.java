package com.koreait.first.ddd;

public class Child extends Parent {
	@Override
	public void print() {
		System.out.println("나는 child!!");
	}

	public void speak() {
		System.out.println("ddddddd");
	}
}