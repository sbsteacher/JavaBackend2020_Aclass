package com.koreait.first.level4;

public class HumanTest {

	public static void main(String[] args) {
		Human h1 = new Human("심사임당");
		Human h2 = new Human(25);	
				
		int age = h1.getAge();
		String name = h1.getName();
		
		System.out.printf("age: %d, name: %s\n"
				, age, name); 
		//20, 심사임당
				
		System.out.printf("age: %d, name: %s\n"
				, h2.getAge(), h2.getName());
		//25, 이순신
	}

}














