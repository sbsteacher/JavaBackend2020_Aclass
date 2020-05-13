package com.koreait.first.ddd;

public class Test {

	public static void main(String[] args) {
		doPrint(new Parent());
		doPrint(new Child());
		doPrint(new GrandChild());
	}
	
	public static void doPrint(Parent c) {
		c.print();
		if(c instanceof Child) {
			Child cc = (Child)c;
			cc.speak();
		}
		
	}
	

}
