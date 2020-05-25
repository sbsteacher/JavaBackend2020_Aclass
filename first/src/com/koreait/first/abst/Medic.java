package com.koreait.first.abst;

public class Medic extends Unit implements Curable {
	public static int INIT_HP = 40;
	
	public Medic() {	
		super("메딕", INIT_HP, INIT_HP);		
	}
	
	public void cure(Bionic bio) {
		Unit unit = (Unit)bio;
		int maxHp = unit.getMaxHp();
		unit.setHp(maxHp);
	}
}
