package com.koreait.first.abst;

public class FixUnit extends Unit {
	public FixUnit(String name, int hp, int maxHp) {
		super(name, hp, maxHp);
	}

	public void fix(Mecanic meca) {
		Unit unit = (Unit)meca;
		int maxHp = unit.getMaxHp();
		unit.setHp(maxHp);		
	}
}
