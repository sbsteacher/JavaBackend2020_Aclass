package com.koreait.first.level3;

public class ObjTest2 {

	public static void main(String[] args) {
		int mainWheel = 4;
		System.out.println("mainWheel : " + mainWheel);
		changeWheel(mainWheel);
		System.out.println("mainWheel : " + mainWheel);
		
		System.out.println("--------------");
		
		Car car = new Car();
		car.wheel = 200;
		System.out.println("car.wheel : " + car.wheel);
		changeWheel(car);
		System.out.println("car.wheel : " + car.wheel);
	}
	
	public static void changeWheel(int mainWheel) {
		mainWheel = 10;
	}

	public static void changeWheel(Car car) {
		car.wheel = 10;
	}
}


