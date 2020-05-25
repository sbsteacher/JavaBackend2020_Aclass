package com.koreait.first.abst;

public class Unit {
	private String name;
	private int hp;
	private int maxHp;
	
	public Unit(String name, int hp, int maxHp) {
		this.name = name;
		this.hp = hp;
		this.maxHp = maxHp;
	}
	
	public String getName() {
		return name;
	}
	
	public int getHp() {
		return hp;
	}
	
	public void setHp(int hp) {
		this.hp = hp;
	}
	
	public int getMaxHp() {
		return maxHp;
	}
	
	public void setMaxHp(int maxHp) {
		this.maxHp = maxHp;
	}
	
	@Override
	public String toString() {
		return String.format("%s의 체력: %d", name, hp);
	}
}
