package com.koreait.first.abst;

public class Marine extends Unit implements Bionic {
	public static int INIT_HP = 30;
	
	public Marine() {	
		super("마린", INIT_HP, INIT_HP);		
	}
}
