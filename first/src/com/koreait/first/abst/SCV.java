package com.koreait.first.abst;

public class SCV extends FixUnit implements Mecanic{
public static int INIT_HP = 40;
	
	public SCV() {	
		super("SCV", INIT_HP, INIT_HP);		
	}
}
