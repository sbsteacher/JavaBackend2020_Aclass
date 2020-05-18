package com.koreait.first.level5;

public class AnimalTest {

	public static void main(String[] args) {		
		Lion lion = new Lion();
		Dog dog = new Dog();
		Cat cat = new Cat();
		Animal animal = lion;
		System.out.println("ani instanceof Lion : " 
				+ (animal instanceof Lion));
		
		
		AnimalTest at = new AnimalTest();	
		at.cry(lion);		
	}
	
	void cry(Animal ani) {
		ani.crying();
		
		
	}
	
	

}
