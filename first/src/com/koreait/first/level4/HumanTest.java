package com.koreait.first.level4;

public class HumanTest {

	public static void main(String[] args) {
		Human h1 = new Human();		
		h1.printMyInfo();
		
		Human h2 = new Human("성돈", 27);
		h2.printMyInfo();
		
		Human h3 = new Human("성돈");
		h3.printMyInfo();
		
		Human h4 = new Human(34);
		h4.printMyInfo();
	}

}
