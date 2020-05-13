package com.koreait.first.level3;

public class ObjTest {

	public static void main(String[] args) {
		Car car = new Car();		
		car.color = "Yello";
		
		Car car2 = new Car();
		car2.color = "하늘색";
						
		car.color = "Red";
		
		car = car2;
		System.out.println("car.color : " + car.color); //하늘색, Red, Red, 하늘색
		System.out.println("car2.color : " + car2.color); //Red, 하늘색, 하늘색, 하늘색
	}

}
