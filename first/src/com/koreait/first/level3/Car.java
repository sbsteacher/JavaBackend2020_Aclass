package com.koreait.first.level3;

public class Car {
	boolean powerOn;
	String color;
	int wheel;
	int speed;
	boolean wiperOn;
	
	public void power() {
		powerOn = !powerOn;
	}
	public void speedUp() {
		speed++;
	}
	void speedDown() {
		speed--;
	}
	void wiper() {
		wiperOn = !wiperOn;
	}
}
