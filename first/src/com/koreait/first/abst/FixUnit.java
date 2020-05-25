package com.koreait.first.abst;

public class FixUnit extends Unit {
	public FixUnit(String name, int hp, int maxHp) {
		super(name, hp, maxHp);
	}

	public void fix(Unit unit) {
		
		if(this == unit) {
			System.out.println("자기가 자기를 고칠 수 없다.");
			return;
		}
		if(!(unit instanceof Mecanic)) {
			System.out.println("메카닉이 아니면 고칠 수 없다.");			
			return;
		}
		//Unit unit = (Unit)meca;
		int maxHp = unit.getMaxHp();
		unit.setHp(maxHp);		
	}
}
