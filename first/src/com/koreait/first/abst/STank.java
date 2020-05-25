package com.koreait.first.abst;

public class STank extends Unit implements Mecanic {
	public static int INIT_HP = 50;
	
	public STank() {	
		super("시저탱크", INIT_HP, INIT_HP);		
	}
}
